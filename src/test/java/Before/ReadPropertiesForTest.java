package Before;

import Utils.PropertiesReader;

import java.util.Properties;

/**
 * Created by spirit on 1/6/17.
 */
public class ReadPropertiesForTest {
    private Properties anyData = PropertiesReader.readProperties("data.properties");

    protected String anyData(String data) {
        return anyData.getProperty(data);
    }
}
