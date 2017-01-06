package Tests;

import Before.BeforeClass;

/**
 * Created by spirit on 1/6/17.
 */
public class Test extends BeforeClass{
    @org.testng.annotations.Test
    public void test(){
        driver.get(anyData("homePage"));
    }

}
