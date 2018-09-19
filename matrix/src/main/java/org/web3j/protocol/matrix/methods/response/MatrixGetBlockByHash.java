package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class MatrixGetBlockByHash extends Response<MatrixGetBlockByHash> {


    private int version;
    private String hash;
    private HeaderBean header;
    private BodyBean body;

    public MatrixGetBlockByHash() {
    }

    public MatrixGetBlockByHash(int version, String hash, HeaderBean header, BodyBean body) {
        this.version = version;
        this.hash = hash;
        this.header = header;
        this.body = body;
    }

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

    public static class HeaderBean {


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

        public static class ProofBean {

            private BftBean Bft;

            public BftBean getBft() {
                return Bft;
            }

            public void setBft(BftBean Bft) {
                this.Bft = Bft;
            }

            public static class BftBean {

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
                    return "BftBean{" +
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
                        "Bft=" + Bft +
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

    public static class BodyBean {
        private List<TransactionsBean> transactions;

        public List<TransactionsBean> getTransactions() {
            return transactions;
        }

        public void setTransactions(List<TransactionsBean> transactions) {
            this.transactions = transactions;
        }

        public static class TransactionsBean {

            private String hash;
            private String content;

            public String getHash() {
                return hash;
            }

            public void setHash(String hash) {
                this.hash = hash;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            @Override
            public String toString() {
                return "TransactionsBean{" +
                        "hash='" + hash + '\'' +
                        ", content='" + content + '\'' +
                        '}';
            }
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
        return "MatrixGetBlockByHash{" +
                "version=" + version +
                ", hash='" + hash + '\'' +
                ", header=" + header +
                ", body=" + body +
                '}';
    }
}
