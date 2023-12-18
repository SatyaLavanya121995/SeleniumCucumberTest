package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public WebDriver driver;
    @FindBy(xpath = ".//input[@name='username']")
    public WebElement userName;
    @FindBy(xpath = ".//input[@name='password']")
    public WebElement password;
    @FindBy(id = "orangehrm-login-branding")
    public WebElement urltitle;

    @FindBy(xpath = "//div[@class='oxd-form-actions orangehrm-login-action']/button")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    public WebElement dashboardtitle;

    @FindBy(xpath = ".//div[@class='oxd-alert oxd-alert--error']")
    public WebElement invalidHeader;

    @FindBy(xpath = ".//div[@id='header']/h1")
    public WebElement locationHeader;

    public void loginURL(String url){
        if(url.equalsIgnoreCase("Orange")) {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Assert.assertTrue("URL is launched successfully", urltitle.isDisplayed());
        } else if (url.equalsIgnoreCase("Location")) {
            driver.get("https://my-location.org/");
            Assert.assertTrue("URL is launched successfully", locationHeader.isDisplayed());
        }
    }

    public void entercredentials(String usernameInput, String passwordInput){
        userName.sendKeys(usernameInput);
        password.sendKeys(passwordInput);
        loginBtn.click();
    }
    public void validateLogin(){
        if(dashboardtitle.isDisplayed()){
            Assert.assertTrue("Dashboard is launched successfully",dashboardtitle.isDisplayed());
        } else{
            Assert.assertTrue("Login failed due to invalid credentials",invalidHeader.isDisplayed());
        }
    }
}
