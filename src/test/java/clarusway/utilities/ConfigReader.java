package clarusway.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {// dosyayı okuma işlemi yapılıyor


    public static Properties properties;

    static{//önce statik blok çalışır..
        String filePath="config.properties";
        try {
            FileInputStream fis=new FileInputStream(filePath);

            properties=new Properties();
            properties.load(fis);

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}