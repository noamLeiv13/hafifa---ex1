package com.company;

import java.io.InputStream;

abstract class Extractor {
    private InputStream fis;

    public Extractor(InputStream fis) {
        this.fis = fis;
    }

    public InputStream getFis() {
        return fis;
    }

    public void setFis(InputStream fis) {
        this.fis = fis;
    }


    abstract InputStream extract() throws Exception;
}
