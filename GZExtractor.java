package com.company;

import java.io.*;
import java.util.zip.GZIPInputStream;


public class GZExtractor extends Extractor {


    public GZExtractor(String sourceFile) throws Exception {
        super(new FileInputStream(sourceFile));
    }

    public GZExtractor() throws Exception {
        super(null);
    }

    @Override
    InputStream extract() throws Exception {
        return new GZIPInputStream(this.getFis());
    }
}