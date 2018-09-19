package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class MatrixGetBlockByNumber extends Response<MatrixGetBlockByNumber> {

    private int version;
    private String hash;
    private HeaderBean header;
    private BodyBean body;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public HeaderBean getHeader() {
        return header;
    }

    public void setHeader(HeaderBean header) {
        this.header = header;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public class HeaderBean {

        private long timestamp;
        private String prevHash;
        private String number;
        private String stateRoot;
        private String transactionsRoot;
        private String receiptsRoot;
        private String gasUsed;
        private ProofBean proof;
        private String proposer;

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public String getPrevHash() {
            return prevHash;
        }

        public void setPrevHash(String prevHash) {
            this.prevHash = prevHash;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getStateRoot() {
            return stateRoot;
        }

        public void setStateRoot(String stateRoot) {
            this.stateRoot = stateRoot;
        }

        public String getTransactionsRoot() {
            return transactionsRoot;
        }

        public void setTransactionsRoot(String transactionsRoot) {
            this.transactionsRoot = transactionsRoot;
        }

        public String getReceiptsRoot() {
            return receiptsRoot;
        }

        public void setReceiptsRoot(String receiptsRoot) {
            this.receiptsRoot = receiptsRoot;
        }

        public String getGasUsed() {
            return gasUsed;
        }

        public void setGasUsed(String gasUsed) {
            this.gasUsed = gasUsed;
        }

        public ProofBean getProof() {
            return proof;
        }

        public void setProof(ProofBean proof) {
            this.proof = proof;
        }

        public String getProposer() {
            return proposer;
        }

        public void setProposer(String proposer) {
            this.proposer = proposer;
        }

        public class ProofBean {

            private TendermintBean Tendermint;

            public TendermintBean getTendermint() {
                return Tendermint;
            }

            public void setTendermint(TendermintBean Tendermint) {
                this.Tendermint = Tendermint;
            }

            public class TendermintBean {

                private String proposal;
                private BigInteger height;
                private BigInteger round;
                private Map<String, String> commits;

                public String getProposal() {
                    return proposal;
                }

                public void setProposal(String proposal) {
                    this.proposal = proposal;
                }

                public BigInteger getHeight() {
                    return height;
                }

                public void setHeight(BigInteger height) {
                    this.height = height;
                }

                public BigInteger getRound() {
                    return round;
                }

                public void setRound(BigInteger round) {
                    this.round = round;
                }

                public Map<String, String> getCommits() {
                    return commits;
                }

                public void setCommits(Map<String, String> commits) {
                    this.commits = commits;
                }

                @Override
                public String toString() {
                    return "TendermintBean{" +
                            "proposal='" + proposal + '\'' +
                            ", height=" + height +
                            ", round=" + round +
                            ", commits=" + commits +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "ProofBean{" +
                        "Tendermint=" + Tendermint +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "HeaderBean{" +
                    "timestamp=" + timestamp +
                    ", prevHash='" + prevHash + '\'' +
                    ", number='" + number + '\'' +
                    ", stateRoot='" + stateRoot + '\'' +
                    ", transactionsRoot='" + transactionsRoot + '\'' +
                    ", receiptsRoot='" + receiptsRoot + '\'' +
                    ", gasUsed='" + gasUsed + '\'' +
                    ", proof=" + proof +
                    ", proposer='" + proposer + '\'' +
                    '}';
        }
    }

    public class BodyBean {

        private List<Map<String, String>> transactions;

        public List<Map<String, String>> getTransactions() {
            return transactions;
        }

        public void setTransactions(List<Map<String, String>> transactions) {
            this.transactions = transactions;
        }

        @Override
        public String toString() {
            return "BodyBean{" +
                    "transactions=" + transactions +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MatrixGetBlockByNumber{" +
                "version=" + version +
                ", hash='" + hash + '\'' +
                ", header=" + header +
                ", body=" + body +
                '}';
    }
}
