package org.TestSuite;
import org.oneWorldAccuracy.PageObjects.OWALandingPage;
import org.testng.annotations.Test;
import reusable.signIn;

import java.io.IOException;


public class homePage extends signIn {

    //Test that user can see all data in the home page.
    @Test

        public void homePageTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

        OWALandingPage loginCheck = new OWALandingPage(driver);

        //Assert that homepage data loads successfully.
        if(loginCheck.getloginAlert().checkCovid() && loginCheck.getloginAlert().checkEQA()){

            System.out.println("Data in the 1wa homepage app loads successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();


    }
}
