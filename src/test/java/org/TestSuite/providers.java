package org.TestSuite;
import org.oneWorldAccuracy.PageObjects.OWALandingPage;
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

        providercheck.getprovidersModule().click();

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
