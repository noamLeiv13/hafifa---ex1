package org.sierra.ETL;

import org.sierra.Decode.Decoder;
import org.sierra.Extract.Extractor;
import org.sierra.Write.Writer;

import java.io.IOException;
import java.io.InputStream;

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

    public void extractEncodedCompressedFile () throws IOException {
        InputStream extractedData = extractor.extract(this.sourceFile);
        InputStream decodedData = decoder.decode(extractedData);
        writer.write(decodedData, this.outputFile);
    }


}
