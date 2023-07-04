package com.conversor.connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.excepcion.Excepcion;

public class URLReader {
    public String getRatio(String codigoMoneda) throws Excepcion {

        if (codigoMoneda.equals("USD")) {
            return "1.0";
        }

        KeyManager manager = new KeyManager();
        final String KEY_ID = manager.readKey(".env/info.key");
        StringBuilder contenido = new StringBuilder();
        String[] stringsBorradas = { " ", ":", ",", "\"", codigoMoneda };

        try {
            URL url = new URL("https://openexchangerates.org/api/latest.json?app_id=" + KEY_ID);
            URLConnection connection = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains(codigoMoneda)) {
                    for (String string : stringsBorradas) {
                        inputLine = inputLine.replace(string, "");
                    }
                    contenido.append(inputLine);
                }
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (contenido.length() != 0) {
            return contenido.toString();
        } else {
            throw new Excepcion("No existe el código de moneda.");
        }
    }
}
