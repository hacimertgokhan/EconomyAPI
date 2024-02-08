package net.hacimertgokhan.reader;

import net.hacimertgokhan.Main;

import java.io.*;
import java.util.Properties;

public class EconomgFileReader {
    private Properties languageProperties = new Properties();
    public EconomgFileReader(){}

    public void ReadLanguageFile(){
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("language.properties")) {
            languageProperties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getLanguage(String message) {return languageProperties.getProperty(message);}

}
