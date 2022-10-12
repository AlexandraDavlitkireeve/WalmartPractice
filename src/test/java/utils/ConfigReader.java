package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String readProperty(String property) {
        Properties props = null;
        try {
            FileInputStream fileInput = new FileInputStream("config.properties");
            props = new Properties();
            props.load(fileInput);
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props.getProperty(property);
    }
}
