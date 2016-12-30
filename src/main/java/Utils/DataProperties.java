package Utils;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by spirit on 03.12.16.
 */
public class DataProperties {
    private static Properties PROPERTIES;

    static {
        PROPERTIES = new Properties();
        URL props = ClassLoader.getSystemResource("data.properties");
        try {
            PROPERTIES.load(props.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
