package org.web3j.protocol.matrix.methods.response;

import org.web3j.protocol.core.Response;

import java.util.List;

public class MatrixGetPeers extends Response<MatrixGetPeers> {

    private List<PeersBean> peers;

    public List<PeersBean> getPeers() {
        return peers;
    }

    public void setPeers(List<PeersBean> peers) {
        this.peers = peers;
    }

    public static class PeersBean {
        /**
         * ip : 59.73.73.133
         * port : 4483
         * account : 0xea4f6bc98b456ef085da5c424db710489848cab5
         */

        private String ip;
        private String port;
        private String account;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }
    }

}
