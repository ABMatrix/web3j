package org.web3j.protocol.matrix.methods;

import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.JsonRpc2_0Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.matrix.methods.response.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public class JsonRpc2_0Matrix extends JsonRpc2_0Web3j implements Matrix {

    public JsonRpc2_0Matrix(Web3jService web3jService) {
        super(web3jService);
    }

    public JsonRpc2_0Matrix(Web3jService web3jService, long pollingInterval, ScheduledExecutorService scheduledExecutorService) {
        super(web3jService, pollingInterval, scheduledExecutorService);
    }

    @Override
    public Request<?, MatrixPeerCount> peerCount() {
        return new Request<>(
                "peerCount",
                Collections.<String>emptyList(),
                web3jService,
                MatrixPeerCount.class);
    }

    @Override
    public Request<?, MatrixBlockNumber> blockNumber() {
        return new Request<>(
                "blockNumber",
                Collections.<String>emptyList(),
                web3jService,
                MatrixBlockNumber.class);
    }

    @Override
    public Request<?, MatrixGetBlockByHash> getBlockByHash(String hash) {
        return new Request<>(
                "getBlockByHash",
                Arrays.asList(hash, true),
                web3jService,
                MatrixGetBlockByHash.class);
    }

    @Override
    public Request<?, MatrixGetBlockByNumber> getBlockByNumber(String blockHeight) {
        return new Request<>(
                "getBlockByNumber",
                Arrays.asList(blockHeight, true),
                web3jService,
                MatrixGetBlockByNumber.class);
    }

    @Override
    public Request<?, MatrixGetTransaction> getTransaction(String hash) {
        return new Request<>(
                "getTransaction",
                Arrays.asList(hash),
                web3jService,
                MatrixGetTransaction.class);
    }

    @Override
    public Request<?, MatrixGetTransactionCount> getTransactionCount(String address, String BlockNumber) {
        return new Request<>(
                "getTransactionCount",
                Arrays.asList(address, BlockNumber),
                web3jService,
                MatrixGetTransactionCount.class);
    }

    @Override
    public Request<?, MatrixGetCode> getCode(String address, String BlockNumber) {
        return new Request<>(
                "getCode",
                Arrays.asList(address, BlockNumber),
                web3jService,
                MatrixGetCode.class);
    }

    @Override
    public Request<?, MatrixGetAbi> getAbi(String address, String BlockNumber) {
        return new Request<>(
                "getAbi",
                Arrays.asList(address, BlockNumber),
                web3jService,
                MatrixGetAbi.class);
    }

    @Override
    public Request<?, MatrixGetBalance> getBalance(String address, String BlockNumber) {
        return new Request<>(
                "getBalance",
                Arrays.asList(address, BlockNumber),
                web3jService,
                MatrixGetBalance.class);
    }

    @Override
    public Request<?, MatrixGetTransactionProof> getTransactionProof(String transactionHash) {
        return new Request<>(
                "getTransactionProof",
                Arrays.asList(transactionHash),
                web3jService,
                MatrixGetTransactionProof.class);
    }

    @Override
    public Request<?, MatrixGetMetaData> getMetaData(String BlockNumber) {
        return new Request<>(
                "getMetaData",
                Arrays.asList(BlockNumber),
                web3jService,
                MatrixGetMetaData.class);
    }

    @Override
    public Request<?, MatrixGetBlockHeader> getBlockHeader(String BlockNumber) {
        return new Request<>(
                "getBlockHeader",
                Arrays.asList(BlockNumber),
                web3jService,
                MatrixGetBlockHeader.class);
    }

    @Override
    public Request<?, MatrixGetStateProof> getStateProof(String address, String position, String BlockNumber) {
        return new Request<>(
                "getStateProof",
                Arrays.asList(address, position, BlockNumber),
                web3jService,
                MatrixGetStateProof.class);
    }

    @Override
    public Request<?, MatrixGetTransactionReceipt> getTransactionReceipt(String transactionHash) {
        return new Request<>(
                "getTransactionReceipt",
                Arrays.asList(transactionHash),
                web3jService,
                MatrixGetTransactionReceipt.class);
    }
}
