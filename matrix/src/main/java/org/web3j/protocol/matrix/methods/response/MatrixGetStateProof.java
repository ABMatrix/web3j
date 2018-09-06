package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

public class MatrixGetStateProof extends Response<String> {
    public String getStateProof() {
        return getResult();
    }
}
