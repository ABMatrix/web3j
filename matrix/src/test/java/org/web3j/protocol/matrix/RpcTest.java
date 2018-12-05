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

        System.out.println(matrix.getBlockByHash("0xf238112feab8d0c5416d7108eadfeffc23797498466839b775554fa6527847b9").send().getResult());

    }

    @Test
    public void testGetBlockByNumber() throws Exception {

        System.out.println(matrix.getBlockByNumber("0x" + Integer.toHexString(3)).send().getResult());

    }

    @Test
    public void testGetTransaction() throws Exception {

        System.out.println(matrix.getTransaction("0x8e62fb58b26ef5455c7b529b6c56bc84e731c8ca06cc4b5538622302ad3dce96").send().getResult().getHash());

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

        System.out.println(matrix.getBalance("0x9dfc655e741a7f1cfea75c9b25e5197c24b67cb6", "latest").send().getResult());

    }

    @Test
    public void testGetTransactionProof() throws Exception {

        System.out.println(matrix.getTransactionProof("0x6011915176e24a1cd70e022984ca37c1e4c5a243e32303e87dd510e70da7a1c5").send().getResult());

    }

    @Test
    public void testGetMetaData() throws Exception {

        System.out.println(matrix.getMetaData("latest").send().getResult().getVersion());

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
    public void testGetTransactionReceipt() throws Exception {

        System.out.println(matrix.getTransactionReceipt("0x9b5cb468fb34f67ba2663255b1f0aa8e000d037e06c9fa6759cbe99f04cb7eb2").send().getResult());

    }

    @Test
    public void testCall() throws Exception {

        System.out.println(matrix.call(null, "0xce1d8d464c1ced95b3487ecada6b495f9fc5785d", "0x18160ddd", "latest").send().getData());

    }

    @Test
    public void testGetPeers() throws Exception {

        System.out.println(matrix.getPeers().send().getResult().getPeers());

    }

    @Test
    public void testEstimateGas() throws Exception {

        System.out.println(matrix.estimateGas(null, "0x0D9C9CDC6BFF56520772195948A6B13C2b2bAA8a", null, "0xa9059cbb000000000000000000000000f8f6f31a14b73a71a310d7b8a895e20261fe09d40000000000000000000000000000000000000000000000000000000000004e20", "latest").send().getResult());

    }

    @Test
    public void testGetGasPrice() throws Exception {

        System.out.println(matrix.getGasPrice().send().getResult());

    }

    @Test
    public void testSyncing() throws Exception {

        System.out.println(matrix.syncing().send().getResult());

    }

    @Test
    public void testGetTransactionReceiptEx() throws Exception {

        System.out.println(matrix.getTransactionReceiptEx("0x9b5cb468fb34f67ba2663255b1f0aa8e000d037e06c9fa6759cbe99f04cb7eb2").send().getResult());

    }
}
