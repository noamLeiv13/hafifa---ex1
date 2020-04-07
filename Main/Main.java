package org.sierra.Main;

import org.sierra.Decode.Base64Decoder;
import org.sierra.ETL.ETL;
import org.sierra.Extract.GZExtractor;
import org.sierra.Write.FilesWriter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("src/org/sierra/Configuration/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            String sourceFile = prop.getProperty("sourceFile");
            String outputFile = prop.getProperty("outputFile");
            GZExtractor extractor = new GZExtractor();
            Base64Decoder decoder = new Base64Decoder();
            FilesWriter writer = new FilesWriter();
            ETL etl = new ETL(extractor, decoder, writer, sourceFile, outputFile);
            etl.extractEncodedCompressedFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
