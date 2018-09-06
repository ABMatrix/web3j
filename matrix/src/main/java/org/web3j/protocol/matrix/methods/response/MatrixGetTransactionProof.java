package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

public class MatrixGetTransactionProof extends Response<String> {
    public String getTransactionProo() {
        return getResult();
    }
}
