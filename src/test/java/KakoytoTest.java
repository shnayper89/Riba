import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by spirit on 03.12.16.
 */
public class KakoytoTest {

   // private WebDriver driver;
   WebDriver driver = new FirefoxDriver();


    @Before
    public void before() {
       // if (driver == null) {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver");
       //     FirefoxDriver driver = new FirefoxDriver();
   //     }
//        else {
//            ChromeDriver driver = new ChromeDriver();
//            // Add here properties
//        }
    }

    @Test
    public void youtfg() {
        driver.get("http://google.com");
    }


    @After
    public void after() {
        driver.close();
    }
}
