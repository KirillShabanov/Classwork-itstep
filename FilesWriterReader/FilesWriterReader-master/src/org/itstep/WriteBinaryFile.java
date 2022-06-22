package org.itstep;

import java.io.*;

public class WriteBinaryFile {
    public static void main(String[] args) {
        String s = "It's binary file";
        byte[] buffer = s.getBytes();
        String fileName = "src/org/itstep/date/dateBin.bin";
        try (FileOutputStream fos= new FileOutputStream(fileName,false);
             DataOutputStream dos = new DataOutputStream(fos)){
            dos.writeUTF(s);
            dos.writeDouble(3.14);
            dos.writeInt(21);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
