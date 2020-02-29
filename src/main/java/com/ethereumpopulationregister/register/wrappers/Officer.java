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
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
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
public class Officer extends Contract {
    private static final String BINARY = "0x608060405234801561001057600080fd5b506040516109da3803806109da8339818101604052608081101561003357600080fd5b810190808051906020019092919080519060200190929190805190602001909291908051906020019092919050505083600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600380819055506001600260008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055506001600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055506001600260008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555050505050610815806101c56000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c80637e69e9121161005b5780637e69e9121461015e57806382fde09314610213578063bc685ce014610231578063e05746061461027b5761007d565b80630a144391146100825780631dc09e7b146100de5780633055cd7d14610124575b600080fd5b6100c46004803603602081101561009857600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610336565b604051808215151515815260200191505060405180910390f35b61010a600480360360208110156100f457600080fd5b8101908080359060200190929190505050610356565b604051808215151515815260200191505060405180910390f35b61015c6004803603604081101561013a57600080fd5b81019080803590602001909291908035151590602001909291905050506103f1565b005b61018a6004803603602081101561017457600080fd5b8101908080359060200190929190505050610538565b6040518080602001848152602001838152602001828103825285818151815260200191508051906020019080838360005b838110156101d65780820151818401526020810190506101bb565b50505050905090810190601f1680156102035780820380516001836020036101000a031916815260200191505b5094505050505060405180910390f35b61021b610607565b6040518082815260200191505060405180910390f35b61023961060d565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6103346004803603602081101561029157600080fd5b81019080803590602001906401000000008111156102ae57600080fd5b8201836020820111156102c057600080fd5b803590602001918460018302840111640100000000831117156102e257600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610633565b005b60026020528060005260406000206000915054906101000a900460ff1681565b6000600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16146103b257600080fd5b60008083815481106103c057fe5b9060005260206000209060040201905060028160020154106103e65760019150506103ec565b60009150505b919050565b60008083815481106103ff57fe5b90600052602060002090600402019050600260003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff1661046557600080fd5b8060030160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16156104be57600080fd5b60018160030160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555081156105335780600201600081548092919060010191905055505b505050565b6000818154811061054557fe5b9060005260206000209060040201600091509050806000018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156105f15780601f106105c6576101008083540402835291602001916105f1565b820191906000526020600020905b8154815290600101906020018083116105d457829003601f168201915b5050505050908060010154908060020154905083565b60035481565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161461068d57600080fd5b61069561071a565b604051806060016040528083815260200160008152602001600081525090506000819080600181540180825580915050906001820390600052602060002090600402016000909192909190915060008201518160000190805190602001906106fe92919061073b565b5060208201518160010155604082015181600201555050505050565b60405180606001604052806060815260200160008152602001600081525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061077c57805160ff19168380011785556107aa565b828001600101855582156107aa579182015b828111156107a957825182559160200191906001019061078e565b5b5090506107b791906107bb565b5090565b6107dd91905b808211156107d95760008160009055506001016107c1565b5090565b9056fea265627a7a72315820028aebd3df2ee798607af3e20263b8f9c0d0647de31c5a10bac0584303ebf42d64736f6c634300050c0032";

    public static final String FUNC_APPROVERS = "approvers";

    public static final String FUNC_APPROVERSCOUNT = "approversCount";

    public static final String FUNC_COMPLAINTS = "complaints";

    public static final String FUNC_OFFICER = "officer";

    public static final String FUNC_CREATECOMPLAINT = "createComplaint";

    public static final String FUNC_COMPLAINTSTATUS = "complaintStatus";

    public static final String FUNC_APPROVECOMPLAINT = "approveComplaint";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected Officer(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Officer(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Officer(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Officer(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Boolean> approvers(String param0) {
        final Function function = new Function(FUNC_APPROVERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<BigInteger> approversCount() {
        final Function function = new Function(FUNC_APPROVERSCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple3<String, BigInteger, BigInteger>> complaints(BigInteger param0) {
        final Function function = new Function(FUNC_COMPLAINTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Int256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple3<String, BigInteger, BigInteger>>(function,
                new Callable<Tuple3<String, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<String, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, BigInteger, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> officer() {
        final Function function = new Function(FUNC_OFFICER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> createComplaint(String report) {
        final Function function = new Function(
                FUNC_CREATECOMPLAINT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(report)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> complaintStatus(BigInteger index) {
        final Function function = new Function(FUNC_COMPLAINTSTATUS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> approveComplaint(BigInteger index, Boolean decision) {
        final Function function = new Function(
                FUNC_APPROVECOMPLAINT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(index), 
                new org.web3j.abi.datatypes.Bool(decision)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Officer load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Officer(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Officer load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Officer(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Officer load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Officer(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Officer load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Officer(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Officer> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String creator, String approver1, String approver2, String approver3) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(creator), 
                new org.web3j.abi.datatypes.Address(approver1), 
                new org.web3j.abi.datatypes.Address(approver2), 
                new org.web3j.abi.datatypes.Address(approver3)));
        return deployRemoteCall(Officer.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Officer> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String creator, String approver1, String approver2, String approver3) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(creator), 
                new org.web3j.abi.datatypes.Address(approver1), 
                new org.web3j.abi.datatypes.Address(approver2), 
                new org.web3j.abi.datatypes.Address(approver3)));
        return deployRemoteCall(Officer.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Officer> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String creator, String approver1, String approver2, String approver3) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(creator), 
                new org.web3j.abi.datatypes.Address(approver1), 
                new org.web3j.abi.datatypes.Address(approver2), 
                new org.web3j.abi.datatypes.Address(approver3)));
        return deployRemoteCall(Officer.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Officer> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String creator, String approver1, String approver2, String approver3) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(creator), 
                new org.web3j.abi.datatypes.Address(approver1), 
                new org.web3j.abi.datatypes.Address(approver2), 
                new org.web3j.abi.datatypes.Address(approver3)));
        return deployRemoteCall(Officer.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
