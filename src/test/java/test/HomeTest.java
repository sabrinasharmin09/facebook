package test;

import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

@Test
public void homepagetest(String f) {
           getHomePage();
           homepage.clickOnCreateGoogleAccount(f);

}





}
