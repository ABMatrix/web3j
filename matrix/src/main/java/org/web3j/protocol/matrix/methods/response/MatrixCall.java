package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;
import org.web3j.utils.Numeric;

import java.math.BigInteger;

public class MatrixCall extends Response<String> {
    public BigInteger getData() {
        return Numeric.decodeQuantity(getResult());
    }
}
