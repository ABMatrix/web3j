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

        System.out.println(matrix.getBlockByNumber("0x" + Integer.toHexString(20)).send().getResult());

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

        System.out.println(matrix.getTransactionReceipt("0x8b92985c31aaac7484d399c5b84e7735ffa43df632892e0935788be9d3a083b8").send().getResult());

    }

    @Test
    public void testCall() throws Exception {

        System.out.println(matrix.call(null, "0xce1d8d464c1ced95b3487ecada6b495f9fc5785d", "0x18160ddd", "latest").send().getData());

    }

    @Test
    public void testGetPeers() throws Exception {

        System.out.println(matrix.getPeers().send().getResult().getPeers());

    }

}
