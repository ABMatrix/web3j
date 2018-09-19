package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;

public class MatrixGetTransactionReceipt extends Response<MatrixGetTransactionReceipt> {

    private String transactionHash;
    private String transactionIndex;
    private String blockHash;
    private String blockNumber;
    private String cumulativeGasUsed;
    private String gasUsed;
    private String contractAddress;
    private String root;
    private String logsBloom;
    private List<LogsBean> logs;

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public String getTransactionIndex() {
        return transactionIndex;
    }

    public void setTransactionIndex(String transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getCumulativeGasUsed() {
        return cumulativeGasUsed;
    }

    public void setCumulativeGasUsed(String cumulativeGasUsed) {
        this.cumulativeGasUsed = cumulativeGasUsed;
    }

    public String getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getLogsBloom() {
        return logsBloom;
    }

    public void setLogsBloom(String logsBloom) {
        this.logsBloom = logsBloom;
    }

    public List<LogsBean> getLogs() {
        return logs;
    }

    public void setLogs(List<LogsBean> logs) {
        this.logs = logs;
    }

    public static class LogsBean {

        private String address;
        private String data;
        private String blockHash;
        private String blockNumber;
        private String transactionHash;
        private String transactionIndex;
        private String logIndex;
        private String transactionLogIndex;
        private List<String> topics;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getBlockHash() {
            return blockHash;
        }

        public void setBlockHash(String blockHash) {
            this.blockHash = blockHash;
        }

        public String getBlockNumber() {
            return blockNumber;
        }

        public void setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
        }

        public String getTransactionHash() {
            return transactionHash;
        }

        public void setTransactionHash(String transactionHash) {
            this.transactionHash = transactionHash;
        }

        public String getTransactionIndex() {
            return transactionIndex;
        }

        public void setTransactionIndex(String transactionIndex) {
            this.transactionIndex = transactionIndex;
        }

        public String getLogIndex() {
            return logIndex;
        }

        public void setLogIndex(String logIndex) {
            this.logIndex = logIndex;
        }

        public String getTransactionLogIndex() {
            return transactionLogIndex;
        }

        public void setTransactionLogIndex(String transactionLogIndex) {
            this.transactionLogIndex = transactionLogIndex;
        }

        public List<String> getTopics() {
            return topics;
        }

        public void setTopics(List<String> topics) {
            this.topics = topics;
        }

        @Override
        public String toString() {
            return "LogsBean{" +
                    "address='" + address + '\'' +
                    ", data='" + data + '\'' +
                    ", blockHash='" + blockHash + '\'' +
                    ", blockNumber='" + blockNumber + '\'' +
                    ", transactionHash='" + transactionHash + '\'' +
                    ", transactionIndex='" + transactionIndex + '\'' +
                    ", logIndex='" + logIndex + '\'' +
                    ", transactionLogIndex='" + transactionLogIndex + '\'' +
                    ", topics=" + topics +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MatrixGetTransactionReceipt{" +
                "transactionHash='" + transactionHash + '\'' +
                ", transactionIndex='" + transactionIndex + '\'' +
                ", blockHash='" + blockHash + '\'' +
                ", blockNumber='" + blockNumber + '\'' +
                ", cumulativeGasUsed='" + cumulativeGasUsed + '\'' +
                ", gasUsed='" + gasUsed + '\'' +
                ", contractAddress='" + contractAddress + '\'' +
                ", root='" + root + '\'' +
                ", logsBloom='" + logsBloom + '\'' +
                ", logs=" + logs +
                '}';
    }
}
