package com.company;

import java.io.InputStream;
import java.io.OutputStream;

abstract class Writer {
    private InputStream fis;
    private OutputStream fos;


    public Writer(InputStream fis, OutputStream fos) {
        this.fis = fis;
        this.fos = fos;
    }


    abstract void write() throws Exception;


    public InputStream getFis() {
        return fis;
    }

    public OutputStream getFos() {
        return fos;
    }

    public void setFis(InputStream fis) {
        this.fis = fis;
    }

    public void setFos(OutputStream fos) {
        this.fos = fos;
    }
}
