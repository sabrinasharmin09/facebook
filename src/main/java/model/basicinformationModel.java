package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basicinformationModel extends BaseModel{


    public basicinformationModel(WebDriver d){
        super(d);
    }

    public WebElement getMonth() throws InterruptedException {
        Thread.sleep(2000);
        WebElement e = driver.findElement(By.xpath("//select[@id='month']"));

        return e;
    }



    public WebElement getDay(){
        WebElement e=driver.findElement(By.xpath("//input[@name='day']"));
        return e;
    }

    public WebElement getYear(){
        WebElement e =driver.findElement(By.xpath("//input[@aria-label='Year']"));
        return e;
    }


    public WebElement getGender(){
        // Thread.sleep(2000);
        WebElement e = driver.findElement(By.xpath("//select[@id='gender']"));

        return e;
    }

    public WebElement getNext1(){
        WebElement e=driver.findElement(By.xpath("//span[text()='Next']"));
        return e;
    }
}
