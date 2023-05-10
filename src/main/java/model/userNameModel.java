package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class userNameModel extends BaseModel{


    public userNameModel(WebDriver d){
        super(d);
    }

    public WebElement getUserName(){
        WebElement e =driver.findElement(By.xpath("//input[@name='Username']"));
        return e;
    }


    public WebElement getNext2(){
        WebElement e=driver.findElement(By.xpath("//span[text()='Next']"));
        return e;
    }
}
