package TestCases;

import Drivers.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC001 extends BaseTest {
    @Test
    public void trendyolLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fastLogin();
    }

}
