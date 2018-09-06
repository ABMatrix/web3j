package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Map;

public class MatrixGetBlockByHash extends Response<MatrixGetBlockByHash> {

    /**
     * version : 0
     * hash : 0x0279e6ba01d88afe886a16d5e28b22213d955577e258312aadc8a49a284ee5e7
     * header : {"timestamp":1536114746559,"prevHash":"0xdf54b05152f023af9bab5bdaef79f8f6793755586f602a5b5761c74cc03ddfb6","number":"0x67","stateRoot":"0x21d1644375e287cb9acc1dab7d7e3f242230ef4032baafc9231ba72cfa7739f7","transactionsRoot":"0x6011915176e24a1cd70e022984ca37c1e4c5a243e32303e87dd510e70da7a1c5","receiptsRoot":"0xd69f93a8824fde872b170230287527a2d2dd4f1808a7088735361a2268cb60c2","gasUsed":"0xaef9","proof":{"Bft":{"proposal":"0x6d86e1798459711ae5d7e2c58ed5f61de0d3b63db1eecf7b13d6a54882dee7dd","height":102,"round":0,"commits":{"0x530cc9f439c2d99a33246295a43da700b016d099":"0xbf1a1ae2edc2f422ebe4916c41a7f6191f10d4136af1b1e868c14404087b171d528f997461fba78733a3804cc147771e6172173759215d59346f363335591c4700","0x6292ad7281c1cfd166eef5ce3e42293f4a88778b":"0x4af06fa12c0e042ab05799ff0dbbb4b5bed8def93d8ef7be0139a7ad4367cbb63fffa32af613ddb7c5dd2ad1f91c7839ecbb2bc20c65303ccfee0228c06c0aa900","0xb49783afdb65bc11b3c8119dbd41fc76a7d7c420":"0x027ac838278a75d1e9b0ed524048d6da54bc41d4ad70c5c9977eb4dac2c109da5938107a29306345afb6e23206725d48eedce47137f512d5af58093f1320392101","0xa78658e76f4af7591d55af9539f8d5ba82ff4e26":"0xdf447508b655031ef9b0a5e8b65031ba117929d562071f26984f210efb3e962a16ce25a1f4d49ef38be2b027712718870433d12c6fe7acb157eb6ec4c44a147901"}}},"proposer":"0xb49783afdb65bc11b3c8119dbd41fc76a7d7c420"}
     * body : {"transactions":[{"hash":"0x6011915176e24a1cd70e022984ca37c1e4c5a243e32303e87dd510e70da7a1c5","content":"0x0ab402120645344c334c5418c0843d20ba012afe01608060405234801561001057600080fd5b5060df8061001f6000396000f3006080604052600436106049576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806360fe47b114604e5780636d4ce63c146078575b600080fd5b348015605957600080fd5b5060766004803603810190808035906020019092919050505060a0565b005b348015608357600080fd5b50608a60aa565b6040518082815260200191505060405180910390f35b8060008190555050565b600080549050905600a165627a7a723058205aed214856a5c433292a354261c9eb88eed1396c83dabbe105bde142e49838ac00293220000000000000000000000000000000000000000000000000000000000000000038011241c06d98e87d7a944f42688b053be23113b3dbdba0ff10f72be4ee03c2337bb55976319fd19c456d52b2c5e99b6e0677bcb443a9052a053a2199d1cd0b1124316d00"}]}
     */

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
        /**
         * timestamp : 1536114746559
         * prevHash : 0xdf54b05152f023af9bab5bdaef79f8f6793755586f602a5b5761c74cc03ddfb6
         * number : 0x67
         * stateRoot : 0x21d1644375e287cb9acc1dab7d7e3f242230ef4032baafc9231ba72cfa7739f7
         * transactionsRoot : 0x6011915176e24a1cd70e022984ca37c1e4c5a243e32303e87dd510e70da7a1c5
         * receiptsRoot : 0xd69f93a8824fde872b170230287527a2d2dd4f1808a7088735361a2268cb60c2
         * gasUsed : 0xaef9
         * proof : {"Bft":{"proposal":"0x6d86e1798459711ae5d7e2c58ed5f61de0d3b63db1eecf7b13d6a54882dee7dd","height":102,"round":0,"commits":{"0x530cc9f439c2d99a33246295a43da700b016d099":"0xbf1a1ae2edc2f422ebe4916c41a7f6191f10d4136af1b1e868c14404087b171d528f997461fba78733a3804cc147771e6172173759215d59346f363335591c4700","0x6292ad7281c1cfd166eef5ce3e42293f4a88778b":"0x4af06fa12c0e042ab05799ff0dbbb4b5bed8def93d8ef7be0139a7ad4367cbb63fffa32af613ddb7c5dd2ad1f91c7839ecbb2bc20c65303ccfee0228c06c0aa900","0xb49783afdb65bc11b3c8119dbd41fc76a7d7c420":"0x027ac838278a75d1e9b0ed524048d6da54bc41d4ad70c5c9977eb4dac2c109da5938107a29306345afb6e23206725d48eedce47137f512d5af58093f1320392101","0xa78658e76f4af7591d55af9539f8d5ba82ff4e26":"0xdf447508b655031ef9b0a5e8b65031ba117929d562071f26984f210efb3e962a16ce25a1f4d49ef38be2b027712718870433d12c6fe7acb157eb6ec4c44a147901"}}}
         * proposer : 0xb49783afdb65bc11b3c8119dbd41fc76a7d7c420
         */

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
            /**
             * Bft : {"proposal":"0x6d86e1798459711ae5d7e2c58ed5f61de0d3b63db1eecf7b13d6a54882dee7dd","height":102,"round":0,"commits":{"0x530cc9f439c2d99a33246295a43da700b016d099":"0xbf1a1ae2edc2f422ebe4916c41a7f6191f10d4136af1b1e868c14404087b171d528f997461fba78733a3804cc147771e6172173759215d59346f363335591c4700","0x6292ad7281c1cfd166eef5ce3e42293f4a88778b":"0x4af06fa12c0e042ab05799ff0dbbb4b5bed8def93d8ef7be0139a7ad4367cbb63fffa32af613ddb7c5dd2ad1f91c7839ecbb2bc20c65303ccfee0228c06c0aa900","0xb49783afdb65bc11b3c8119dbd41fc76a7d7c420":"0x027ac838278a75d1e9b0ed524048d6da54bc41d4ad70c5c9977eb4dac2c109da5938107a29306345afb6e23206725d48eedce47137f512d5af58093f1320392101","0xa78658e76f4af7591d55af9539f8d5ba82ff4e26":"0xdf447508b655031ef9b0a5e8b65031ba117929d562071f26984f210efb3e962a16ce25a1f4d49ef38be2b027712718870433d12c6fe7acb157eb6ec4c44a147901"}}
             */

            private BftBean Bft;

            public BftBean getBft() {
                return Bft;
            }

            public void setBft(BftBean Bft) {
                this.Bft = Bft;
            }

            public static class BftBean {
                /**
                 * proposal : 0x6d86e1798459711ae5d7e2c58ed5f61de0d3b63db1eecf7b13d6a54882dee7dd
                 * height : 102
                 * round : 0
                 * commits : {"0x530cc9f439c2d99a33246295a43da700b016d099":"0xbf1a1ae2edc2f422ebe4916c41a7f6191f10d4136af1b1e868c14404087b171d528f997461fba78733a3804cc147771e6172173759215d59346f363335591c4700","0x6292ad7281c1cfd166eef5ce3e42293f4a88778b":"0x4af06fa12c0e042ab05799ff0dbbb4b5bed8def93d8ef7be0139a7ad4367cbb63fffa32af613ddb7c5dd2ad1f91c7839ecbb2bc20c65303ccfee0228c06c0aa900","0xb49783afdb65bc11b3c8119dbd41fc76a7d7c420":"0x027ac838278a75d1e9b0ed524048d6da54bc41d4ad70c5c9977eb4dac2c109da5938107a29306345afb6e23206725d48eedce47137f512d5af58093f1320392101","0xa78658e76f4af7591d55af9539f8d5ba82ff4e26":"0xdf447508b655031ef9b0a5e8b65031ba117929d562071f26984f210efb3e962a16ce25a1f4d49ef38be2b027712718870433d12c6fe7acb157eb6ec4c44a147901"}
                 */

                private String proposal;
                private int height;
                private int round;
                private Map<String, String> commits;

                public String getProposal() {
                    return proposal;
                }

                public void setProposal(String proposal) {
                    this.proposal = proposal;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getRound() {
                    return round;
                }

                public void setRound(int round) {
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
            /**
             * hash : 0x6011915176e24a1cd70e022984ca37c1e4c5a243e32303e87dd510e70da7a1c5
             * content : 0x0ab402120645344c334c5418c0843d20ba012afe01608060405234801561001057600080fd5b5060df8061001f6000396000f3006080604052600436106049576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806360fe47b114604e5780636d4ce63c146078575b600080fd5b348015605957600080fd5b5060766004803603810190808035906020019092919050505060a0565b005b348015608357600080fd5b50608a60aa565b6040518082815260200191505060405180910390f35b8060008190555050565b600080549050905600a165627a7a723058205aed214856a5c433292a354261c9eb88eed1396c83dabbe105bde142e49838ac00293220000000000000000000000000000000000000000000000000000000000000000038011241c06d98e87d7a944f42688b053be23113b3dbdba0ff10f72be4ee03c2337bb55976319fd19c456d52b2c5e99b6e0677bcb443a9052a053a2199d1cd0b1124316d00
             */

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
