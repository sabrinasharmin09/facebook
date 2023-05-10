package page;

import model.HomeGoogleModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends HomeGoogleModel {

    public Homepage(WebDriver d){
        super(d);
    }

    public void clickOnCreateGoogleAccount(String firstname){
        WebElement e=getCreateAccount();
        e.clear();
        e.sendKeys(firstname);

      //  e.click();
    }


    public void clickNext(){
        WebElement e = getClickNext();
        e.click();
    }
}
