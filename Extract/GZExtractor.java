package org.sierra.Extract;

import java.io.*;
import java.util.zip.GZIPInputStream;


public class GZExtractor implements Extractor {


    @Override
    public InputStream extract(String sourceFile) throws IOException {
        return new GZIPInputStream((new FileInputStream(sourceFile)));
    }
}