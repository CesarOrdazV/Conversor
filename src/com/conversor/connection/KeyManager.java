package com.conversor.connection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KeyManager {
     public String readKey(String fileToRead) {
        try {
            StringBuilder builder = new StringBuilder();
            String beginKey = "---- BEGIN KEY ----";
            String endKey = "---- END KEY ----";

            File file = new File(fileToRead);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                builder.append(data);
            }
            reader.close();

            String myKey = builder.toString();
            myKey = myKey.replace(beginKey, "").replace(endKey, "");
            return myKey;

        } catch (FileNotFoundException error) {
            error.printStackTrace();
            return null;
        }
    }  
}
