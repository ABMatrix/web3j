package org.web3j.protocol.matrix.methods;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.matrix.methods.response.*;

public interface Matrix extends Web3j {

    static Matrix build(Web3jService web3jService) {
        return new JsonRpc2_0Matrix(web3jService);
    }

    Request<?, MatrixPeerCount> peerCount();

    Request<?, MatrixBlockNumber> blockNumber();

    Request<?, MatrixGetBlockByHash> getBlockByHash(String hash);

    Request<?, MatrixGetBlockByNumber> getBlockByNumber(String blockHeight);

    Request<?, MatrixGetTransaction> getTransaction(String hash);

    Request<?, MatrixGetTransactionCount> getTransactionCount(String address, String BlockNumber);

    Request<?, MatrixGetCode> getCode(String address, String BlockNumber);

    Request<?, MatrixGetAbi> getAbi(String address, String BlockNumber);

    Request<?, MatrixGetBalance> getBalance(String address, String BlockNumber);

    Request<?, MatrixGetTransactionProof> getTransactionProof(String transactionHash);

    Request<?, MatrixGetMetaData> getMetaData(String BlockNumber);

    Request<?, MatrixGetBlockHeader> getBlockHeader(String BlockNumber);

    Request<?, MatrixGetStateProof> getStateProof(String address, String position, String BlockNumber);

    Request<?, MatrixGetTransactionReceipt> getTransactionReceipt(String transactionHash);

    Request<?, MatrixCall> call(String from, String to, String data, String blockNumber);

}
