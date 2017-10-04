package gllc.tech.blocksteps.Auomation;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.3.0.
 */
public final class _Users_Admin_Desktop_Steps_sol_Steps extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b5b5b5b610804806100216000396000f300606060405236156100755763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416637a725806811461007a5780638c88af22146100dd5780638fd2f1cd146101405780639b2ea4bd146101a3578063bf40fac114610201578063dc5e5c0f1461026e575b600080fd5b341561008557600080fd5b6100cb60046024813581810190830135806020601f820181900481020160405190810160405281815292919060208401838380828437509496506102c695505050505050565b60405190815260200160405180910390f35b34156100e857600080fd5b6100cb60046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061033795505050505050565b60405190815260200160405180910390f35b341561014b57600080fd5b6100cb60046024813581810190830135806020601f820181900481020160405190810160405281815292919060208401838380828437509496506103a895505050505050565b60405190815260200160405180910390f35b34156101ae57600080fd5b6101ff60046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965050509235600160a060020a0316925061042e915050565b005b341561020c57600080fd5b61025260046024813581810190830135806020601f820181900481020160405190810160405281815292919060208401838380828437509496506104d195505050505050565b604051600160a060020a03909116815260200160405180910390f35b341561027957600080fd5b6101ff600480359060446024803590810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061055795505050505050565b005b60006001826040518082805190602001908083835b602083106102fb57805182525b601f1990920191602091820191016102db565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390205490505b919050565b60006002826040518082805190602001908083835b602083106102fb57805182525b601f1990920191602091820191016102db565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390205490505b919050565b600160a060020a033316600090815260208190526040808220908390518082805190602001908083835b602083106102fb57805182525b601f1990920191602091820191016102db565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390205490505b919050565b8060036000846040518082805190602001908083835b6020831061046457805182525b601f199092019160209182019101610444565b6001836020036101000a038019825116818451161790925250505091909101925060409150505190819003902081526020810191909152604001600020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03929092169190911790555b5050565b600060036000836040518082805190602001908083835b6020831061050857805182525b601f1990920191602091820191016104e8565b6001836020036101000a03801982511681845116179092525050509190910192506040915050519081900390208152602081019190915260400160002054600160a060020a031690505b919050565b600160a060020a03331660009081526020819052604080822082918490518082805190602001908083835b602083106105a257805182525b601f199092019160209182019101610582565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390205460001480156105e55750600084115b1561065b5760016002846040518082805190602001908083835b6020831061061f57805182525b601f1990920191602091820191016105ff565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051908190039020805490910190555b600160a060020a03331660009081526020819052604090819020908490518082805190602001908083835b602083106106a657805182525b601f199092019160209182019101610686565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390205491508184039050806001846040518082805190602001908083835b6020831061071557805182525b601f1990920191602091820191016106f5565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405190819003902080549091019055600160a060020a0333166000908152602081905260409081902085918590518082805190602001908083835b6020831061079c57805182525b601f19909201916020918201910161077c565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051908190039020555b505050505600a165627a7a723058209816723386967f2bd7df8a98b4a6fc02f3f0f4b4b755745340e64377ea15e2fa0029";

    private _Users_Admin_Desktop_Steps_sol_Steps(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private _Users_Admin_Desktop_Steps_sol_Steps(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Uint256> everyoneStepsDate(Utf8String date) {
        Function function = new Function("everyoneStepsDate", 
                Arrays.<Type>asList(date), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> countAllPeopleDate(Utf8String date) {
        Function function = new Function("countAllPeopleDate", 
                Arrays.<Type>asList(date), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> recallMySteps(Utf8String date) {
        Function function = new Function("recallMySteps", 
                Arrays.<Type>asList(date), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> setAddress(Utf8String a, Address b) {
        Function function = new Function("setAddress", Arrays.<Type>asList(a, b), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Address> getAddress(Utf8String a) {
        Function function = new Function("getAddress", 
                Arrays.<Type>asList(a), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> saveMySteps(Uint256 numSteps, Utf8String date) {
        Function function = new Function("saveMySteps", Arrays.<Type>asList(numSteps, date), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<_Users_Admin_Desktop_Steps_sol_Steps> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(_Users_Admin_Desktop_Steps_sol_Steps.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<_Users_Admin_Desktop_Steps_sol_Steps> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(_Users_Admin_Desktop_Steps_sol_Steps.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static _Users_Admin_Desktop_Steps_sol_Steps load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new _Users_Admin_Desktop_Steps_sol_Steps(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static _Users_Admin_Desktop_Steps_sol_Steps load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new _Users_Admin_Desktop_Steps_sol_Steps(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
