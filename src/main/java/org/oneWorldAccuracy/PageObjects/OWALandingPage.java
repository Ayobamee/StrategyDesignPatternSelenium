package org.oneWorldAccuracy.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.oneWorldAccuracy.PageComponents.*;

public class OWALandingPage {

    By loginAlert = By.xpath("//body/div[@id='root']/div[1]/div[1]/a[1]/div[1]/div[2]");
    By programModule = By.xpath("//a[@id='MENU_PROGRAMS']");
    By discipline = By.xpath("//div[contains(text(),'Discipline')]");
    By program = By.xpath("//div[contains(text(),'Program')]");
    By ordercode = By.xpath("//div[contains(text(),'Order Code')]");
    By analytes = By.xpath("//div[contains(text(),'Analytes')]");
    By providersModule = By.xpath("//a[contains(text(),'Providers')]");




    WebDriver driver;
    public OWALandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public loginAlert getloginAlert()
    {
        return new loginAlert(driver, loginAlert);
    }


    public programModule getprogramModule()
    {
        return new programModule(driver, programModule);
    }

    public program getprogram()
    {
        return new program(driver, program);
    }

    public providersModule getprovidersModule()
    {
        return new providersModule(driver, providersModule);
    }



}
