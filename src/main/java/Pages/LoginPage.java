package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By AdsPopUpCls = new By.ById("Group-38");
    By LoginBtn = new By.ById("accountNavigation");
    By LoginID = new By.ById("login-email");
    By LoginPassw = new By.ById("login-password-input");
    By LoginBtnG = new By.ByXPath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button");



    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void fastLogin() {
        click(AdsPopUpCls);
        click(LoginBtn);
        send(LoginID , "monarkshop1@gmail.com");
        send(LoginPassw , "R15yb8b8*");
        click(LoginBtnG);

    }

    }



