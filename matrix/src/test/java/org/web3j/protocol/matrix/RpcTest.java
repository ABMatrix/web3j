package org.web3j.protocol.matrix;

import org.junit.Test;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.matrix.methods.Matrix;

public class RpcTest {

    private Web3jService service = new HttpService("http://192.168.1.200:1338");

    private Matrix matrix = Matrix.build(service);

    @Test
    public void testPeerCount() throws Exception {

        System.out.println(matrix.peerCount().send().getPeerCount());

    }

    @Test
    public void testBlockNumber() throws Exception {

        System.out.println(matrix.blockNumber().send().getBlockNumber());

    }

    @Test
    public void testGetBlockByHash() throws Exception {

        System.out.println(matrix.getBlockByHash("0x0279e6ba01d88afe886a16d5e28b22213d955577e258312aadc8a49a284ee5e7").send().getResult().getHash());

    }

    @Test
    public void testGetBlockByNumber() throws Exception {

//        for (int i = 3000; i < 10000; i++) {
//
//            if (matrix.getBlockByNumber("0x" + Integer.toHexString(i)).send().getResult().getBody().getTransactions().size() > 0) {
//
//                System.out.println("qwe");
//
//                System.out.println(matrix.getBlockByNumber("0x" + Integer.toHexString(i)).send().getResult().getBody());
//
//            }
//
//        }

        System.out.println(matrix.getBlockByNumber("0x35fd7").send().getResult());

    }

    @Test
    public void testGetTransaction() throws Exception {

        System.out.println(matrix.getTransaction("0x6011915176e24a1cd70e022984ca37c1e4c5a243e32303e87dd510e70da7a1c5").send().getResult().getHash());

    }

    @Test
    public void testGetTransactionCount() throws Exception {

        System.out.println(matrix.getTransactionCount("0x0dbd369a741319fa5107733e2c9db9929093e3c7", "latest").send().getResult());

    }

    @Test
    public void testGetCode() throws Exception {

        System.out.println(matrix.getCode("0x73552bc4e960a1d53013b40074569ea05b950b4d", "latest").send().getResult());

    }

    @Test
    public void testGetAbi() throws Exception {

        System.out.println(matrix.getAbi("", "latest").send().getResult());

    }

    @Test
    public void testGetBalance() throws Exception {

        System.out.println(matrix.getBalance("0x0dbd369a741319fa5107733e2c9db9929093e3c7", "latest").send().getResult());

    }

    @Test
    public void testGetTransactionProof() throws Exception {

        System.out.println(matrix.getTransactionProof("0x6011915176e24a1cd70e022984ca37c1e4c5a243e32303e87dd510e70da7a1c5").send().getResult());

    }

    @Test
    public void testGetMetaData() throws Exception {

        System.out.println(matrix.getMetaData("latest").send().getResult().getChainName());

    }

    @Test
    public void testGetBlockHeader() throws Exception {

        System.out.println(matrix.getBlockHeader("latest").send().getResult());

    }

    @Test
    public void testGetStateProof() throws Exception {

        System.out.println(matrix.getStateProof("", "", "latest").send().getResult());

    }

    @Test
    public void testGetTransactionReceiptf() throws Exception {

        System.out.println(matrix.getTransactionReceipt("0x7e3a82c8951fdc032811826732152fb137e88eaea8f10ea1307fed294f720a9d").send().getResult());

    }
}
