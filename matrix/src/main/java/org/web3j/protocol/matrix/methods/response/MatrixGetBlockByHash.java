package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;
import java.util.Map;

public class MatrixGetBlockByHash extends Response<MatrixGetBlockByHash> {

    /**
     * version : 0
     * hash : 0x5038c222d460c32fd06df36d58bb7cf5c368a55e207a46ecb18695451bfe4069
     * header : {"timestamp":1499756200950,"prevHash":"0xb28ec1911d375350664b9673a61d952e9a748f3e63606f1440f313c4911fde58","proof":{"proposal":"0x0f25d396361c7d54bb16389f6a14bf95207915f91d180d382093e19adfc4133b","height":902,"round":0,"commits":{"0x2b027dacd33a41ddb09e21805778f19951776ed5":"0x1532c58faedf9e103dd84aa6aacbd2121aa3a8102faa506e7e152fb10e45bafd31b1c3d372cf5d42f8b27a8bfea112ae194de76d99206f73837ad8c30267e6a501","0x2d74a106464fbdf94e47bb28605a1aa244ab7788":"0x2ec53371cee732d59d23a58cf6cf53d818fb906fdeb5b0521a3a4cdbb75cf29658a1ff5fa95e4dc71563cbed10070c68e2eec0f812fa3be8e019b6df6e9ea66201","0x3efd4959af72e1214ab83caa0f04a0cc3e54d383":"0xb051f0cc41bc3caed472d3c7a35e06d805e8f6d15ccb3efc257d71ee96932c5877a8e52fc29cb3bef73e0edbad62c617c4dd16763709b2604ab8b1db2d87736301","0x5223818f7096520bfad68ce3d5ac959267dbc45f":"0x1cf6f8dc9654d461a317db199de0ed0d2d008762833b3358e269ceb3c412b60b3f1a2bd08f969e0dc1c9ebe1a0710002f853438a6ef3ea048de9b4e67387827400"}},"stateRoot":"0xe29266e5574bc0c848b513d36403d4da71f99f328d3324e8d3134809c33d4fb4","transactionsRoot":"0xf31e32611322f410f430ef8141c2237c19dd1034eddef8dedba692ec9851799b","receiptsRoot":"0x9646cf2572734b4b13fe1616446ab2658e208cfdbaf25e47ebea9b6327e10c5b","gasUsed":"0x0","number":"0x387","proposer":"0xe6d430a2d830236d3774d148cbee72bbf26cd481"}
     * body : {"transactions":[{"hash":"0xf31e32611322f410f430ef8141c2237c19dd1034eddef8dedba692ec9851799b","content":"0x0a28356230373365393233333934346235653732396534366436313866306438656466336439633334611a80040aba030a28356230373365393233333934346235653732396534366436313866306438656466336439633334611a87030a013010a08d0622fd026060604052341561000c57fe5b5b7f4f8cfde3439a1a302c21ca51eec26086efbfd940b8c0279889fc6bb6e73ecc6633604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390a15b5b60fd806100806000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806360fe47b11460445780636d4ce63c146061575bfe5b3415604b57fe5b605f60048080359060200190919050506084565b005b3415606857fe5b606e60c6565b6040518082815260200191505060405180910390f35b7fc6d8c0af6d21f291e7c359603aa97e0ed500f04db6e983b9fce75a91c6b8da6b816040518082815260200191505060405180910390a1806000819055505b50565b600060005490505b905600a165627a7a7230582079ba3769927f0f8cf4bec7ce02513b56823c8fc3f4047989951e042a9a04651900292080808080101241d51ca7a0171113478f47357a71c240bd0431f52639741a6721725de276a88d2e723b12f4bbeb1cdddea63f947ddb9db6e2667f08a03af1577c42d3c1a3dc5a7c01208080808010"}]}
     */

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
        /**
         * timestamp : 1499756200950
         * prevHash : 0xb28ec1911d375350664b9673a61d952e9a748f3e63606f1440f313c4911fde58
         * proof : {"proposal":"0x0f25d396361c7d54bb16389f6a14bf95207915f91d180d382093e19adfc4133b","height":902,"round":0,"commits":{"0x2b027dacd33a41ddb09e21805778f19951776ed5":"0x1532c58faedf9e103dd84aa6aacbd2121aa3a8102faa506e7e152fb10e45bafd31b1c3d372cf5d42f8b27a8bfea112ae194de76d99206f73837ad8c30267e6a501","0x2d74a106464fbdf94e47bb28605a1aa244ab7788":"0x2ec53371cee732d59d23a58cf6cf53d818fb906fdeb5b0521a3a4cdbb75cf29658a1ff5fa95e4dc71563cbed10070c68e2eec0f812fa3be8e019b6df6e9ea66201","0x3efd4959af72e1214ab83caa0f04a0cc3e54d383":"0xb051f0cc41bc3caed472d3c7a35e06d805e8f6d15ccb3efc257d71ee96932c5877a8e52fc29cb3bef73e0edbad62c617c4dd16763709b2604ab8b1db2d87736301","0x5223818f7096520bfad68ce3d5ac959267dbc45f":"0x1cf6f8dc9654d461a317db199de0ed0d2d008762833b3358e269ceb3c412b60b3f1a2bd08f969e0dc1c9ebe1a0710002f853438a6ef3ea048de9b4e67387827400"}}
         * stateRoot : 0xe29266e5574bc0c848b513d36403d4da71f99f328d3324e8d3134809c33d4fb4
         * transactionsRoot : 0xf31e32611322f410f430ef8141c2237c19dd1034eddef8dedba692ec9851799b
         * receiptsRoot : 0x9646cf2572734b4b13fe1616446ab2658e208cfdbaf25e47ebea9b6327e10c5b
         * gasUsed : 0x0
         * number : 0x387
         * proposer : 0xe6d430a2d830236d3774d148cbee72bbf26cd481
         */

        private long timestamp;
        private String prevHash;
        private ProofBean proof;
        private String stateRoot;
        private String transactionsRoot;
        private String receiptsRoot;
        private String gasUsed;
        private String number;
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

        public ProofBean getProof() {
            return proof;
        }

        public void setProof(ProofBean proof) {
            this.proof = proof;
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

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getProposer() {
            return proposer;
        }

        public void setProposer(String proposer) {
            this.proposer = proposer;
        }

        public class ProofBean {
            /**
             * proposal : 0x0f25d396361c7d54bb16389f6a14bf95207915f91d180d382093e19adfc4133b
             * height : 902
             * round : 0
             * commits : {"0x2b027dacd33a41ddb09e21805778f19951776ed5":"0x1532c58faedf9e103dd84aa6aacbd2121aa3a8102faa506e7e152fb10e45bafd31b1c3d372cf5d42f8b27a8bfea112ae194de76d99206f73837ad8c30267e6a501","0x2d74a106464fbdf94e47bb28605a1aa244ab7788":"0x2ec53371cee732d59d23a58cf6cf53d818fb906fdeb5b0521a3a4cdbb75cf29658a1ff5fa95e4dc71563cbed10070c68e2eec0f812fa3be8e019b6df6e9ea66201","0x3efd4959af72e1214ab83caa0f04a0cc3e54d383":"0xb051f0cc41bc3caed472d3c7a35e06d805e8f6d15ccb3efc257d71ee96932c5877a8e52fc29cb3bef73e0edbad62c617c4dd16763709b2604ab8b1db2d87736301","0x5223818f7096520bfad68ce3d5ac959267dbc45f":"0x1cf6f8dc9654d461a317db199de0ed0d2d008762833b3358e269ceb3c412b60b3f1a2bd08f969e0dc1c9ebe1a0710002f853438a6ef3ea048de9b4e67387827400"}
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
                return "ProofBean{" +
                        "proposal='" + proposal + '\'' +
                        ", height=" + height +
                        ", round=" + round +
                        ", commits=" + commits +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "HeaderBean{" +
                    "timestamp=" + timestamp +
                    ", prevHash='" + prevHash + '\'' +
                    ", proof=" + proof +
                    ", stateRoot='" + stateRoot + '\'' +
                    ", transactionsRoot='" + transactionsRoot + '\'' +
                    ", receiptsRoot='" + receiptsRoot + '\'' +
                    ", gasUsed='" + gasUsed + '\'' +
                    ", number='" + number + '\'' +
                    ", proposer='" + proposer + '\'' +
                    '}';
        }
    }

    public class BodyBean {
        private List<TransactionsBean> transactions;

        public List<TransactionsBean> getTransactions() {
            return transactions;
        }

        public void setTransactions(List<TransactionsBean> transactions) {
            this.transactions = transactions;
        }

        public class TransactionsBean {
            /**
             * hash : 0xf31e32611322f410f430ef8141c2237c19dd1034eddef8dedba692ec9851799b
             * content : 0x0a28356230373365393233333934346235653732396534366436313866306438656466336439633334611a80040aba030a28356230373365393233333934346235653732396534366436313866306438656466336439633334611a87030a013010a08d0622fd026060604052341561000c57fe5b5b7f4f8cfde3439a1a302c21ca51eec26086efbfd940b8c0279889fc6bb6e73ecc6633604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390a15b5b60fd806100806000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806360fe47b11460445780636d4ce63c146061575bfe5b3415604b57fe5b605f60048080359060200190919050506084565b005b3415606857fe5b606e60c6565b6040518082815260200191505060405180910390f35b7fc6d8c0af6d21f291e7c359603aa97e0ed500f04db6e983b9fce75a91c6b8da6b816040518082815260200191505060405180910390a1806000819055505b50565b600060005490505b905600a165627a7a7230582079ba3769927f0f8cf4bec7ce02513b56823c8fc3f4047989951e042a9a04651900292080808080101241d51ca7a0171113478f47357a71c240bd0431f52639741a6721725de276a88d2e723b12f4bbeb1cdddea63f947ddb9db6e2667f08a03af1577c42d3c1a3dc5a7c01208080808010
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
