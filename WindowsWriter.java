package com.company;

import java.io.FileOutputStream;
import java.io.InputStream;

public class WindowsWriter extends Writer {
    private int bufferSize = 1024;


    public WindowsWriter(InputStream fis, String targetFile) throws Exception {
        super(fis, new FileOutputStream(targetFile));
    }

    public WindowsWriter() throws Exception {
        super(null, null);
    }

    @Override
    void write() throws Exception {
        byte[] buffer = new byte[bufferSize];
        int length;
        while ((length = this.getFis().read(buffer)) > 0)
            this.getFos().write(buffer, 0, length);
    }


}
