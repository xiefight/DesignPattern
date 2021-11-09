package test;

import java.io.*;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-11-03 17:08
 **/
public class TestBufferWriter {

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\19715\\Desktop\\aaa.txt";

        OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(filePath));
        BufferedWriter writer = new BufferedWriter(write);
        writer.write("1");
        writer.flush();
        write.close();
        writer.close();

    }

}
