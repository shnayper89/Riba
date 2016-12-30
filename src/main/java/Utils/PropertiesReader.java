package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by spirit on 04.12.16.
 */
public class PropertiesReader {
    public static Properties readProperties(String name) {
        try (InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(name)) {
            Properties properties = new Properties();
            properties.load(stream);
            return properties;
        } catch (IOException e) {
            return null;
        }
    }
}
