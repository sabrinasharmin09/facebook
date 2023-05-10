package page;

import model.basicinformationModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasicInformationpage extends basicinformationModel {

    public BasicInformationpage(WebDriver d){
        super(d);
    }


    public void typeMonth(String item) throws InterruptedException {
        WebElement drop=getMonth();
        Select sel =new Select(drop);
        sel.selectByVisibleText(item);;
        // e.clear();
        //   e.sendKeys(month);
    }


    public void typeDay(String day){
        WebElement e =getDay();
        e.sendKeys(day);
    }


    public void typeYear(String year){
        WebElement e =getYear();
        e.sendKeys(year);
    }

    public void typeGender(String item) throws InterruptedException {
        WebElement drop=getGender();
        Select sel =new Select(drop);
        sel.selectByVisibleText(item);;
        // e.clear();
        //   e.sendKeys(month);
    }

    public void clickNext1(){
        WebElement e=getNext1();
        e.click();
    }

}
