package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

public class MatrixGetBlockHeader extends Response<String> {
    public String getBlockHeader() {
        return getResult();
    }
}
