package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

public class MatrixGetAbi extends Response<String> {
    public String getAbi() {
        return getResult();
    }
}
