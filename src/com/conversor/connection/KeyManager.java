package com.conversor.connection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
            String mensaje = "KEY_ID no encontrada";
            JOptionPane.showMessageDialog(new JFrame(), mensaje, "¡Error!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }  
}
