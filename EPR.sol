pragma solidity ^0.5.14;

contract Master {

// "0x4B0897b0513fdC7C541B6d9D7E929C4e5364D2dB","0x583031D1113aD414F02576BD6afaBfb302140225","0xdD870fA1b7C4700F2BD7f44238821C26f7392148"
//  Ethereum address to check sum address for testing Remix
//  0xCA35b7d915458EF540aDe6068dFe2F44E8fa733c
//  0x14723A09ACff6D2A60DcdF7aA4AFf308FDDC160C
//  0x4B0897b0513fdC7C541B6d9D7E929C4e5364D2dB
//  0x583031D1113aD414F02576BD6afaBfb302140225
//  0xdD870fA1b7C4700F2BD7f44238821C26f7392148

    //mapping of wallet address to contract and other details
    mapping (address => officerDetails) officerAddress; //key is wallet address while value is contract address
    address payable[] public deployedOfficers;
    address payable masterManager;
    officerDetails[] public proposals; //here contractOrWalletAddress is wallet address

    struct officerDetails {
        address payable contractOrWalletAddress;
        string detailsFile;
    }

    constructor (address payable a, address payable b, address payable c) payable public {
        deployedOfficers.push(a);
        deployedOfficers.push(b);
        deployedOfficers.push(c);
        masterManager=msg.sender;
    }

    function officerProposal(string memory x, address payable walletProposed) public returns (uint){
        proposals.push(officerDetails({contractOrWalletAddress:walletProposed,detailsFile:x}));
        return (proposals.length-1);
    }

    function viewProposal(uint pId) public view returns (string memory) {
        require(pId < proposals.length);
        return proposals[pId].detailsFile;
    }

    function approveProposal(uint pId) payable public restricted {
        uint randomOfficer1=random()%deployedOfficers.length;
        uint randomOfficer2=(randomOfficer1+1)%deployedOfficers.length;
        uint randomOfficer3=(randomOfficer2+1)%deployedOfficers.length;
        proposals[pId].contractOrWalletAddress.transfer(1000000000000000000);
        Officer newOfficer=new Officer(proposals[pId].contractOrWalletAddress, deployedOfficers[randomOfficer1] ,deployedOfficers[randomOfficer2], deployedOfficers[randomOfficer3]);
        address payable temp=address(uint160(address((newOfficer))));

        // deployedOfficers.push(temp);
        officerAddress[proposals[pId].contractOrWalletAddress]=officerDetails({contractOrWalletAddress:temp,detailsFile:proposals[pId].detailsFile});
    }

    function fetchContract (address walletAddress) public view restricted returns (address) {
        return (officerAddress[walletAddress].contractOrWalletAddress);
    }

    function fetchDetails (address walletAddress) public view restricted returns (string memory) {
        return (officerAddress[walletAddress].detailsFile);
    }


    function random() private view returns (uint256) {
        return uint(keccak256(abi.encodePacked(block.difficulty, block.difficulty)));
    }

    modifier restricted() {
        require (msg.sender == masterManager);
        _;
    }

}

contract Officer {

    struct Complaint {
        string report;
        int approved; //status :0 for pending -1 for rejected 1 for approved
        uint approvalCount;
        mapping (address => bool) approvals;
    }

    Complaint[] public complaints;
    address public officer;
    mapping (address => bool) public approvers;
    uint public approversCount;

    constructor (address creator,address approver1, address approver2, address approver3) public{
        officer=creator;
        approversCount=3;
        approvers[approver1]=true;
        approvers[approver2]=true;
        approvers[approver3]=true;
    }

    function createComplaint(string memory report) public restricted {
        Complaint memory newComplaint=Complaint({report:report,approved:0,approvalCount:0});
        complaints.push(newComplaint);
    }

    modifier restricted() {
        require (msg.sender == officer);
        _;
    }

    function complaintStatus(uint index) public view restricted returns(bool) {
        Complaint storage complaint=complaints[index];
        if(complaint.approvalCount>=2)
            return true;
        else
            return false;
    }

    function approveComplaint(uint index, bool decision) public {
        Complaint storage complaint=complaints[index];

        require(approvers[msg.sender]);
        require(!complaint.approvals[msg.sender]);
        complaint.approvals[msg.sender]=true;
        if(decision) {
            complaint.approvalCount++;
        }
    }
}
