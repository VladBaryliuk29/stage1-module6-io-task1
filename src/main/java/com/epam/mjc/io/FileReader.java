package com.epam.mjc.io;

import java.io.*;


public class FileReader {
    public Profile getDataFromFile(File file) {
        try(FileInputStream reader1 = new FileInputStream(file)){
            String information = "";
            int ch;
            while ((ch = reader1.read()) != -1) {
                information += (char)ch;
            }
            String[] strArray = information.split("[ \n\r]");
            Profile profile1 = new Profile(strArray[1], Integer.parseInt(strArray[4]), strArray[7], Long.parseLong(strArray[10]));
            return profile1;
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return null;
    }
}
