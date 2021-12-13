package com.xxjsmile.zookeeper.curator;


public  class CuratorClusterBase extends CuratorStandaloneBase {

    private final static  String CLUSTER_CONNECT_STR="192.168.1.121:2181,192.168.1.121:2182,192.168.1.121:2183,192.168.1.121:2184";

    public   String getConnectStr() {
        return CLUSTER_CONNECT_STR;
    }
}
