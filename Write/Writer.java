package org.sierra.Write;

import java.io.IOException;
import java.io.InputStream;

public interface Writer {
    public void write(InputStream streamToWrite, String targetFile) throws IOException;

}
