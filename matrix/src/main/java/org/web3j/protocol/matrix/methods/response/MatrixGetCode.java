package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

public class MatrixGetCode extends Response<String> {
    public String getCode() {
        return getResult();
    }
}
