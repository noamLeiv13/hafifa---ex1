package org.sierra.Extract;

import java.io.IOException;
import java.io.InputStream;

public interface Extractor {
    public InputStream extract(String sourceFile) throws IOException;
}
