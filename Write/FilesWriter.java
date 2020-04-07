package org.sierra.Write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilesWriter implements Writer {
    private int bufferSize = 1024;


    @Override
    public void write(InputStream streamToWrite, String targetFile) throws IOException {
        byte[] buffer = new byte[bufferSize];
        FileOutputStream outputFile = new FileOutputStream(targetFile);
        int length;
        while ((length = streamToWrite.read(buffer)) > 0)
            outputFile.write(buffer, 0, length);
    }


}
