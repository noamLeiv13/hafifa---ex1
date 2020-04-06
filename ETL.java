package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ETL {
    private Extractor extractor;
    private Decoder decoder;
    private Writer writer;
    private String sourceFile;
    private String outputFile;

    public ETL(Extractor extractor, Decoder decoder, Writer writer, String sourceFile, String outputFile) {
        this.extractor = extractor;
        this.decoder = decoder;
        this.writer = writer;
        this.sourceFile = sourceFile;
        this.outputFile = outputFile;
    }

    public void action() throws Exception {
        extractor.setFis((new FileInputStream(sourceFile)));
        decoder.setFis(extractor.extract());
        writer.setFis(decoder.decode());
        writer.setFos((new FileOutputStream(outputFile)));
        writer.write();
    }


}
