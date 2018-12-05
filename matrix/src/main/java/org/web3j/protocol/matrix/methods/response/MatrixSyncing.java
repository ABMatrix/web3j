package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;
import org.web3j.utils.Numeric;

import java.math.BigInteger;


public class MatrixSyncing extends Response<Boolean> {
    public boolean getGasPrice() {
        return getResult();
    }
}
