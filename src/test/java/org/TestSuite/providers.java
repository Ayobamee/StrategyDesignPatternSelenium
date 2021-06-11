package org.TestSuite;
import org.oneWorldAccuracy.PageObjects.OWALandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import reusable.signIn;

import java.io.IOException;


public class providers extends signIn {

    //Test that user can assess all data in the programs module.
    @Test

        public void programcheckTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

        OWALandingPage providercheck = new OWALandingPage(driver);

        //Click provider.
        providercheck.getprovidersModule().click();

        Select drpCountry = new Select(driver.findElement(By.xpath("//body/div[@id='simple-menu']/div[3]/ul[1]/div[1]/select[1]")));

        //Select canada from provider dropdown.
        drpCountry.selectByVisibleText("Canada");

        //Click catalog.
        providercheck.getcatalog().click();





//        //Assert that program modules load successfully.
//        if(programcheck.getprogram().checkprogram()&programcheck.getprogram().checkanalytes()
//        &programcheck.getprogram().checkdiscipline()&programcheck.getprogram().checkordercode()){
//
//            System.out.println("Program modules load successfully");
//        }
//        else{
//            System.out.println("Oops, something went wrong");
//        }
//
//        //close the app
//        driver.quit();


    }
}
