package com.company;

import java.io.InputStream;

abstract class Decoder {
    private InputStream fis;

    public Decoder(InputStream fis) {
        this.fis = fis;
    }

    public InputStream getFis() {
        return fis;
    }

    public void setFis(InputStream fis) {
        this.fis = fis;
    }

    abstract InputStream decode() throws Exception;
}
