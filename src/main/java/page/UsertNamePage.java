package page;

import model.userNameModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsertNamePage extends userNameModel {

    public UsertNamePage(WebDriver d){
        super(d);
    }

    public void typeUserName(String u){
        WebElement e =getUserName();
        e.sendKeys(u);
    }

    public void clickNext1(){
        WebElement e=getNext2();
        e.click();
    }
}
