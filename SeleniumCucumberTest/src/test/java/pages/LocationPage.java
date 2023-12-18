package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationPage {
    @FindBy(xpath = "//tbody/tr/td[6]/a[contains(text(),'My Address')]")
    public WebElement locationTabs;

    @FindBy(xpath = "//div/span[contains(text(),'Directions')]")
    public WebElement directions;

    @FindBy(xpath = "//div[@id='button_15click_container']")
    public WebElement directionsGo;

    @FindBy(xpath = "(.//div[@class='sbib_b'])[1]/input")
    public WebElement source;

    @FindBy(xpath = "(.//div[@class='sbib_b'])[2]/input")
    public WebElement destination;

    public void navigateToTab(){
        locationTabs.click();
    }

    public void navigateToDirections(){
        directions.click();
        directionsGo.click();
    }

    public void mapDisplay(){
        source.sendKeys();
        destination.sendKeys();
    }
}
