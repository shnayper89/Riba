package Before;

import Pages.LoginPage;
import Utils.PropertiesReader;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by spirit on 1/6/17.
 */
public class BeforeClass extends ReadPropertiesForTest {
    protected static WebDriver driver;
    final String browserPropertyName = "webdriver.chrome.driver";
    final String browserPropertyPath = "/home/spirit/Programs/chromedriver";

    private  LoginPage navigateToLoginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);

    @org.testng.annotations.BeforeClass
    protected WebDriver getWebDriver() {
        System.setProperty(browserPropertyName, browserPropertyPath);

        if (driver == null) {

            DesiredCapabilities caps = DesiredCapabilities.firefox();
            caps.setJavascriptEnabled(true);


            driver = new ChromeDriver(caps);
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().timeouts().implicitlyWait(Long.parseLong(anyData("globalWait")), TimeUnit.SECONDS);
        }
        return driver;
    }
    @BeforeMethod
    public void before(){
        driver.get(anyData("loginPage"));
        navigateToLoginPage.signIn(anyData("login"),anyData("password"));

    }

}
