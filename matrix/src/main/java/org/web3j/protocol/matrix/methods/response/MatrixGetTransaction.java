package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

public class MatrixGetTransaction extends Response<MatrixGetTransaction> {

    /**
     * hash : 0x019abfa50cbb6df5b6dc41eabba47db4e7eb1787a96fd5836820d581287e0236
     * content : 0x0a9b0412013018fface20420f73b2a8d046060604052341561000f57600080fd5b5b60646000819055507f8fb1356be6b2a4e49ee94447eb9dcb8783f51c41dcddfe7919f945017d163bf3336064604051808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018281526020019250505060405180910390a15b5b610178806100956000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806360fe47b1146100495780636d4ce63c1461006c575b600080fd5b341561005457600080fd5b61006a6004808035906020019091905050610095565b005b341561007757600080fd5b61007f610142565b6040518082815260200191505060405180910390f35b7fc6d8c0af6d21f291e7c359603aa97e0ed500f04db6e983b9fce75a91c6b8da6b816040518082815260200191505060405180910390a1806000819055507ffd28ec3ec2555238d8ad6f9faf3e4cd10e574ce7e7ef28b73caa53f9512f65b93382604051808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018281526020019250505060405180910390a15b50565b6000805490505b905600a165627a7a72305820631927ec00e7a86b68950c2304ba2614a8dcb84780b339fc2bfe442bba418ce800291241884bfdfd8e417ab286fd761d42b71a9544071d91084c56f9063471ce82e266122a8f9a24614e1cf75070eea301bf1e7a65857def86093b6892e09ae7d0bcdff901
     * blockNumber : 0x1da3
     * blockHash : 0x296474ecb4c2c8c92b0ba7800a01530b70a6f2b6e76e5c2ed2f89356429ef329
     * index : 0x0
     */

    private String hash;
    private String content;
    private String blockNumber;
    private String blockHash;
    private String index;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
