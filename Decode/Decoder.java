package org.sierra.Decode;

import java.io.InputStream;

public interface Decoder {
    public InputStream decode(InputStream encodedInputStream);

}
