package com.epam.mjc.io;

import java.io.*;


public class FileReader {
    public Profile getDataFromFile(File file) {
        try(FileInputStream reader1 = new FileInputStream(file)){
            int ch;
            StringBuilder bld = new StringBuilder();
            while ((ch = reader1.read()) != -1) {
                bld.append((char)ch);
            }
            String information = bld.toString();
            String[] strArray = information.split("[ \n\r]");
            return new Profile(strArray[1], Integer.parseInt(strArray[4]), strArray[7], Long.parseLong(strArray[10]));
        } catch (IOException e) {
            // Empty on purpose
        }
        return null;
    }
}
