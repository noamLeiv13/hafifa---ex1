package com.company;

public class Main {

    public static void main(String[] args) {
        String sourceFile = "file.txt.gz";
        String outputFile = "xml_output_file.xml";
        try {
            GZExtractor extractor = new GZExtractor();
            Base64Decoder decoder = new Base64Decoder();
            WindowsWriter writer = new WindowsWriter();
            ETL etl = new ETL(extractor, decoder, writer, sourceFile, outputFile);
            etl.action();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
