package org.bitcoinj.core;

import org.bitcoinj.base.Sha256Hash;

public class TxConfidenceManager {

    public static TxConfidenceManager get(){
        return null;
    }

    public int currentDepth(Sha256Hash hash) {
        return 0;
    }

    public int appearedAtChainHeight(Sha256Hash hash) {
        return -1;
    }

    public void setAppearedAtChainHeight(Sha256Hash hash, int appearedAtChainHeight) {

    }

    public void removeAppearedAtChainHeight(Sha256Hash hash) {

    }
}
