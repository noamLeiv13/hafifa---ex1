package org.sierra.Decode;

import java.io.InputStream;
import java.util.Base64;

public class Base64Decoder implements Decoder {

    @Override
    public InputStream decode(InputStream encodedInputStream) {
        return Base64.getMimeDecoder().wrap(encodedInputStream);

    }
}