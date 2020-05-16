package com.ethereumpopulationregister.register.rest;

import com.ethereumpopulationregister.register.wrappers.Master;
import com.ethereumpopulationregister.register.wrappers.Officer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.ManagedTransaction;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class Supplier {

	private boolean isDeployed = false;
	private Master master;
	private String masterAddress;
	private String contractAddress;
	private Web3j deployed;

	@GetMapping("/{value}")
	public String values(@PathVariable String value) {
		return ("hi "+value);
	}

	@GetMapping("/x")
	public String getX() {
		return "success";
	}

	@GetMapping("/deploy/{deploymentUrl}/{masterAddress}/{masterBalance}/{officer1}/{officer2}/{officer3}")
	public String deploy(@PathVariable String deploymentUrl, @PathVariable String masterAddress,
			@PathVariable String masterBalance, @PathVariable String officer1, @PathVariable String officer2,
			@PathVariable String officer3) throws ExecutionException, InterruptedException {

		Web3j web3j = Web3j.build(new HttpService(deploymentUrl));
		this.deployed=web3j;
		Credentials credentials = Credentials.create(masterAddress);
		Master master=Master.deploy(web3j,credentials, ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT,new BigInteger(masterBalance),officer1,officer2,officer3).sendAsync().get();
		contractAddress=master.getContractAddress();
		this.master=master;
		this.masterAddress=masterAddress;

		return contractAddress;
	}

	@GetMapping("/master/approveProposal/{pId}")
	public String approveProposal(@PathVariable String pId) {
		try {
			TransactionReceipt transactionReceipt =master.approveProposal(new BigInteger(pId), new BigInteger("0")).sendAsync().get();
			return transactionReceipt.getTransactionHash();
		}
		catch (Exception e) {
			return "error occured "+e.getMessage();
		}
	}

	@GetMapping("/master/officerProposal/{detailsFile}/{walletProposed}")
	public String officerProposal(@PathVariable String detailsFile, @PathVariable String walletProposed) {
		try {
			TransactionReceipt transactionReceipt=master.officerProposal(detailsFile, walletProposed).sendAsync().get();
			return transactionReceipt.getTransactionHash();
		}
		catch (Exception e) {
			return "error occurred "+e.getMessage();
		}
	}

	@GetMapping("/master/fetchContract/{walletAddress}")
	public String fetchContract(@PathVariable String walletAddress) {
		try {
			return master.fetchContract(walletAddress).sendAsync().get();
		}
		catch (Exception e) {
			return "error occured "+e.getMessage();
		}
	}

	@GetMapping("/master/fetchDetails/{walletAddress}")
	public String fetchDetails(@PathVariable String walletAddress) {
		try {
			return master.fetchDetails(walletAddress).sendAsync().get();
		}
		catch (Exception e) {
			return "error occured " +e.getMessage();
		}
	}

	@GetMapping("/master/viewProposal/{pId}")
	public String viewProposal(@PathVariable String pId) {
		try {
			return master.viewProposal(new BigInteger(pId)).sendAsync().get();
		}
		catch (Exception e) {
			return "error occured "+e.getMessage();
		}
	}

	@GetMapping("/officer/createComplaint/{privateKey}/{walletAddress}/{report}")
	public String createComplaint(@PathVariable String privateKey,@PathVariable String walletAddress, @PathVariable String report) {
		String officerAddress = fetchContract(walletAddress);
		Credentials credentials=Credentials.create(privateKey);
		Officer officer = Officer.load(officerAddress,deployed,credentials,ManagedTransaction.GAS_PRICE,Contract.GAS_LIMIT);
		try {
			TransactionReceipt transactionReceipt = officer.createComplaint(report).sendAsync().get();
			return transactionReceipt.getTransactionHash();
		}
		catch (Exception e) {
			return "error occured "+e.getMessage();
		}
	}


	@GetMapping("/officer/approveComplaint/{privateKey}/{contractAddress}/{index}/{decision}")
	public String approveComplaint(@PathVariable String index, @PathVariable boolean decision,
			@PathVariable String privateKey,  @PathVariable String contractAddress) {
//		String officerAddress = fetchContract(walletAddress);
		Credentials credentials=Credentials.create(privateKey);
		Officer officer = Officer.load(contractAddress,deployed,credentials,ManagedTransaction.GAS_PRICE,Contract.GAS_LIMIT);
		try {
			TransactionReceipt transactionReceipt = officer.approveComplaint(new BigInteger(""+index),decision).sendAsync().get();
			return transactionReceipt.getTransactionHash();
		}
		catch (Exception e) {
			return "error occured "+e.getMessage();
		}
	}

	@GetMapping("/officer/complaintStatus/{privateKey}/{walletAddress}/{index}")
	public String approveComplaint(@PathVariable String privateKey, @PathVariable String walletAddress,
			@PathVariable String index) {
		String officerAddress = fetchContract(walletAddress);
		Credentials credentials=Credentials.create(privateKey);
		Officer officer = Officer.load(officerAddress,deployed,credentials,ManagedTransaction.GAS_PRICE,Contract.GAS_LIMIT);
		try {
			boolean status = officer.complaintStatus(new BigInteger(""+index)).sendAsync().get();
			return (""+status);
		}
		catch (Exception e) {
			return "error occured "+e.getMessage();
		}
	}
}
