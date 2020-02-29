package com.ethereumpopulationregister.register.wrappers;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.10.
 */
@SuppressWarnings("rawtypes")
public class Master extends Contract {
    private static final String BINARY = "0x6080604052604051611b85380380611b858339818101604052606081101561002657600080fd5b8101908080519060200190929190805190602001909291908051906020019092919050505060018390806001815401808255809150509060018203906000526020600020016000909192909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505060018290806001815401808255809150509060018203906000526020600020016000909192909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505060018190806001815401808255809150509060018203906000526020600020016000909192909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505033600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050506119b5806101d06000396000f3fe6080604052600436106100705760003560e01c8063750bcd8a1161004e578063750bcd8a146102e957806398951b5614610364578063df68221814610392578063e3fec1d01461045c57610070565b8063013cf08b14610075578063286c7de41461015c57806350b8838e14610258575b600080fd5b34801561008157600080fd5b506100ae6004803603602081101561009857600080fd5b8101908080359060200190929190505050610510565b604051808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200180602001828103825283818151815260200191508051906020019080838360005b83811015610120578082015181840152602081019050610105565b50505050905090810190601f16801561014d5780820380516001836020036101000a031916815260200191505b50935050505060405180910390f35b34801561016857600080fd5b506102426004803603604081101561017f57600080fd5b810190808035906020019064010000000081111561019c57600080fd5b8201836020820111156101ae57600080fd5b803590602001918460018302840111640100000000831117156101d057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506105f9565b6040518082815260200191505060405180910390f35b34801561026457600080fd5b506102a76004803603602081101561027b57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506106cb565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b3480156102f557600080fd5b506103226004803603602081101561030c57600080fd5b8101908080359060200190929190505050610790565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6103906004803603602081101561037a57600080fd5b81019080803590602001909291905050506107cc565b005b34801561039e57600080fd5b506103e1600480360360208110156103b557600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610cad565b6040518080602001828103825283818151815260200191508051906020019080838360005b83811015610421578082015181840152602081019050610406565b50505050905090810190601f16801561044e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561046857600080fd5b506104956004803603602081101561047f57600080fd5b8101908080359060200190929190505050610dea565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156104d55780820151818401526020810190506104ba565b50505050905090810190601f1680156105025780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6003818154811061051d57fe5b90600052602060002090600202016000915090508060000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690806001018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156105ef5780601f106105c4576101008083540402835291602001916105ef565b820191906000526020600020905b8154815290600101906020018083116105d257829003601f168201915b5050505050905082565b6000600360405180604001604052808473ffffffffffffffffffffffffffffffffffffffff168152602001858152509080600181540180825580915050906001820390600052602060002090600202016000909192909190915060008201518160000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060208201518160010190805190602001906106b6929190610ef4565b50505050600160038054905003905092915050565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161461072757600080fd5b6000808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050919050565b6001818154811061079d57fe5b906000526020600020016000915054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161461082657600080fd5b6000600180549050610836610ebb565b8161083d57fe5b0690506000600180549050600183018161085357fe5b0690506000600180549050600183018161086957fe5b0690506003848154811061087957fe5b906000526020600020906002020160000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc670de0b6b3a76400009081150290604051600060405180830381858888f193505050501580156108f8573d6000803e3d6000fd5b5060006003858154811061090857fe5b906000526020600020906002020160000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166001858154811061094757fe5b9060005260206000200160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166001858154811061097f57fe5b9060005260206000200160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16600185815481106109b757fe5b9060005260206000200160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166040516109ee90610f74565b808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001945050505050604051809103906000f080158015610ad9573d6000803e3d6000fd5b509050600081905060405180604001604052808273ffffffffffffffffffffffffffffffffffffffff16815260200160038881548110610b1557fe5b90600052602060002090600202016001018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610bba5780601f10610b8f57610100808354040283529160200191610bba565b820191906000526020600020905b815481529060010190602001808311610b9d57829003601f168201915b505050505081525060008060038981548110610bd257fe5b906000526020600020906002020160000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008201518160000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506020820151816001019080519060200190610ca1929190610ef4565b50905050505050505050565b6060600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614610d0957600080fd5b6000808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206001018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610dde5780601f10610db357610100808354040283529160200191610dde565b820191906000526020600020905b815481529060010190602001808311610dc157829003601f168201915b50505050509050919050565b60606003805490508210610dfd57600080fd5b60038281548110610e0a57fe5b90600052602060002090600202016001018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610eaf5780601f10610e8457610100808354040283529160200191610eaf565b820191906000526020600020905b815481529060010190602001808311610e9257829003601f168201915b50505050509050919050565b6000444460405160200180838152602001828152602001925050506040516020818303038152906040528051906020012060001c905090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610f3557805160ff1916838001178555610f63565b82800160010185558215610f63579182015b82811115610f62578251825591602001919060010190610f47565b5b509050610f709190610f81565b5090565b6109da80610fa783390190565b610fa391905b80821115610f9f576000816000905550600101610f87565b5090565b9056fe608060405234801561001057600080fd5b506040516109da3803806109da8339818101604052608081101561003357600080fd5b810190808051906020019092919080519060200190929190805190602001909291908051906020019092919050505083600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600380819055506001600260008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055506001600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055506001600260008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555050505050610815806101c56000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c80637e69e9121161005b5780637e69e9121461015e57806382fde09314610213578063bc685ce014610231578063e05746061461027b5761007d565b80630a144391146100825780631dc09e7b146100de5780633055cd7d14610124575b600080fd5b6100c46004803603602081101561009857600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610336565b604051808215151515815260200191505060405180910390f35b61010a600480360360208110156100f457600080fd5b8101908080359060200190929190505050610356565b604051808215151515815260200191505060405180910390f35b61015c6004803603604081101561013a57600080fd5b81019080803590602001909291908035151590602001909291905050506103f1565b005b61018a6004803603602081101561017457600080fd5b8101908080359060200190929190505050610538565b6040518080602001848152602001838152602001828103825285818151815260200191508051906020019080838360005b838110156101d65780820151818401526020810190506101bb565b50505050905090810190601f1680156102035780820380516001836020036101000a031916815260200191505b5094505050505060405180910390f35b61021b610607565b6040518082815260200191505060405180910390f35b61023961060d565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6103346004803603602081101561029157600080fd5b81019080803590602001906401000000008111156102ae57600080fd5b8201836020820111156102c057600080fd5b803590602001918460018302840111640100000000831117156102e257600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610633565b005b60026020528060005260406000206000915054906101000a900460ff1681565b6000600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16146103b257600080fd5b60008083815481106103c057fe5b9060005260206000209060040201905060028160020154106103e65760019150506103ec565b60009150505b919050565b60008083815481106103ff57fe5b90600052602060002090600402019050600260003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff1661046557600080fd5b8060030160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16156104be57600080fd5b60018160030160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555081156105335780600201600081548092919060010191905055505b505050565b6000818154811061054557fe5b9060005260206000209060040201600091509050806000018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156105f15780601f106105c6576101008083540402835291602001916105f1565b820191906000526020600020905b8154815290600101906020018083116105d457829003601f168201915b5050505050908060010154908060020154905083565b60035481565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161461068d57600080fd5b61069561071a565b604051806060016040528083815260200160008152602001600081525090506000819080600181540180825580915050906001820390600052602060002090600402016000909192909190915060008201518160000190805190602001906106fe92919061073b565b5060208201518160010155604082015181600201555050505050565b60405180606001604052806060815260200160008152602001600081525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061077c57805160ff19168380011785556107aa565b828001600101855582156107aa579182015b828111156107a957825182559160200191906001019061078e565b5b5090506107b791906107bb565b5090565b6107dd91905b808211156107d95760008160009055506001016107c1565b5090565b9056fea265627a7a72315820028aebd3df2ee798607af3e20263b8f9c0d0647de31c5a10bac0584303ebf42d64736f6c634300050c0032a265627a7a7231582087505dff6ee133ee7d92088a348539b0f55159425e933d4294845deeb2a470f564736f6c634300050c0032";

    public static final String FUNC_DEPLOYEDOFFICERS = "deployedOfficers";

    public static final String FUNC_PROPOSALS = "proposals";

    public static final String FUNC_OFFICERPROPOSAL = "officerProposal";

    public static final String FUNC_VIEWPROPOSAL = "viewProposal";

    public static final String FUNC_APPROVEPROPOSAL = "approveProposal";

    public static final String FUNC_FETCHCONTRACT = "fetchContract";

    public static final String FUNC_FETCHDETAILS = "fetchDetails";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected Master(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Master(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Master(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Master(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> deployedOfficers(BigInteger param0) {
        final Function function = new Function(FUNC_DEPLOYEDOFFICERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple2<String, String>> proposals(BigInteger param0) {
        final Function function = new Function(FUNC_PROPOSALS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteFunctionCall<Tuple2<String, String>>(function,
                new Callable<Tuple2<String, String>>() {
                    @Override
                    public Tuple2<String, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, String>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> officerProposal(String x, String walletProposed) {
        final Function function = new Function(
                FUNC_OFFICERPROPOSAL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(x), 
                new org.web3j.abi.datatypes.Address(walletProposed)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> viewProposal(BigInteger pId) {
        final Function function = new Function(FUNC_VIEWPROPOSAL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(pId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> approveProposal(BigInteger pId, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_APPROVEPROPOSAL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(pId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteFunctionCall<String> fetchContract(String walletAddress) {
        final Function function = new Function(FUNC_FETCHCONTRACT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(walletAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> fetchDetails(String walletAddress) {
        final Function function = new Function(FUNC_FETCHDETAILS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(walletAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static Master load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Master(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Master load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Master(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Master load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Master(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Master load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Master(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Master> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, BigInteger initialWeiValue, String a, String b, String c) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(a), 
                new org.web3j.abi.datatypes.Address(b), 
                new org.web3j.abi.datatypes.Address(c)));
        return deployRemoteCall(Master.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor, initialWeiValue);
    }

    public static RemoteCall<Master> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, BigInteger initialWeiValue, String a, String b, String c) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(a), 
                new org.web3j.abi.datatypes.Address(b), 
                new org.web3j.abi.datatypes.Address(c)));
        return deployRemoteCall(Master.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor, initialWeiValue);
    }

    @Deprecated
    public static RemoteCall<Master> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, String a, String b, String c) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(a), 
                new org.web3j.abi.datatypes.Address(b), 
                new org.web3j.abi.datatypes.Address(c)));
        return deployRemoteCall(Master.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    @Deprecated
    public static RemoteCall<Master> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, String a, String b, String c) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(a), 
                new org.web3j.abi.datatypes.Address(b), 
                new org.web3j.abi.datatypes.Address(c)));
        return deployRemoteCall(Master.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
