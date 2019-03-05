package today.bookit.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try {
            String path = System.getProperty("user.dir")+"/configuration.properties";
            System.out.println(path);

            FileInputStream stream = new FileInputStream(path);

            properties = new Properties();
            properties.load(stream);

            stream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) { return properties.getProperty(key); }
}
