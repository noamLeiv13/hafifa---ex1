package com.company;

import java.io.InputStream;
import java.util.Base64;

public class Base64Decoder extends Decoder {

    public Base64Decoder(InputStream fis) {
        super(fis);
    }

    public Base64Decoder() {
        super(null);
    }

    @Override
    InputStream decode() throws Exception {
        return Base64.getMimeDecoder().wrap(this.getFis());
    }
}