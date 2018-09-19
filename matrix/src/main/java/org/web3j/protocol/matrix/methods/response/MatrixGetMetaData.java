package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;

public class MatrixGetMetaData extends Response<MatrixGetMetaData> {

    private int chainId;
    private String chainName;
    private String operator;
    private String website;
    private long genesisTimestamp;
    private int blockInterval;
    private String token_name;
    private String token_symbol;
    private String token_avatar;
    private List<String> validators;

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public long getGenesisTimestamp() {
        return genesisTimestamp;
    }

    public void setGenesisTimestamp(long genesisTimestamp) {
        this.genesisTimestamp = genesisTimestamp;
    }

    public int getBlockInterval() {
        return blockInterval;
    }

    public void setBlockInterval(int blockInterval) {
        this.blockInterval = blockInterval;
    }

    public String getToken_name() {
        return token_name;
    }

    public void setToken_name(String token_name) {
        this.token_name = token_name;
    }

    public String getToken_symbol() {
        return token_symbol;
    }

    public void setToken_symbol(String token_symbol) {
        this.token_symbol = token_symbol;
    }

    public String getToken_avatar() {
        return token_avatar;
    }

    public void setToken_avatar(String token_avatar) {
        this.token_avatar = token_avatar;
    }

    public List<String> getValidators() {
        return validators;
    }

    public void setValidators(List<String> validators) {
        this.validators = validators;
    }
}
