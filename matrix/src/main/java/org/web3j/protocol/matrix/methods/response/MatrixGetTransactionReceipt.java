package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;

public class MatrixGetTransactionReceipt extends Response<MatrixGetTransactionReceipt> {


    /**
     * transactionHash : 0xb38e5b6572b2613cab8088f93e6835576209f2b796104779b4a43fa5adc737af
     * transactionIndex : 0x0
     * blockHash : 0xe068cf7299450b78fe97ed370fd9ebe09ecbd6786968e474fae862ccbd5c5020
     * blockNumber : 0xa
     * cumulativeGasUsed : 0x17a0f
     * gasUsed : 0x17a0f
     * contractAddress : 0xea4f6bc98b456ef085da5c424db710489848cab5
     * logs : [{"address":"0xea4f6bc98b456ef085da5c424db710489848cab5","topics":["0x8fb1356be6b2a4e49ee94447eb9dcb8783f51c41dcddfe7919f945017d163bf3"],"data":"0x0000000000000000000000005b073e9233944b5e729e46d618f0d8edf3d9c34a0000000000000000000000000000000000000000000000000000000000000064","blockHash":"0xe068cf7299450b78fe97ed370fd9ebe09ecbd6786968e474fae862ccbd5c5020","blockNumber":"0xa","transactionHash":"0xb38e5b6572b2613cab8088f93e6835576209f2b796104779b4a43fa5adc737af","transactionIndex":"0x0","logIndex":"0x0","transactionLogIndex":"0x0"}]
     * root : 0xe702d654a292a8d074fd5ba3769b3dead8095d2a8f2207b3a69bd49c91a178af
     * logsBloom : 0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100040000000010000200000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000040000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000020000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
     */

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
        /**
         * address : 0xea4f6bc98b456ef085da5c424db710489848cab5
         * topics : ["0x8fb1356be6b2a4e49ee94447eb9dcb8783f51c41dcddfe7919f945017d163bf3"]
         * data : 0x0000000000000000000000005b073e9233944b5e729e46d618f0d8edf3d9c34a0000000000000000000000000000000000000000000000000000000000000064
         * blockHash : 0xe068cf7299450b78fe97ed370fd9ebe09ecbd6786968e474fae862ccbd5c5020
         * blockNumber : 0xa
         * transactionHash : 0xb38e5b6572b2613cab8088f93e6835576209f2b796104779b4a43fa5adc737af
         * transactionIndex : 0x0
         * logIndex : 0x0
         * transactionLogIndex : 0x0
         */

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
