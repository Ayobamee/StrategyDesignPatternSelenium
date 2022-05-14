package org.oneWorldAccuracy.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.oneWorldAccuracy.PageComponents.*;

public class OWALandingPage {

    By loginAlert = By.xpath("//body/div[@id='root']/div[1]/div[1]/a[1]/div[1]/div[2]");
    By programModule = By.xpath("//body/div[@id='root']/div[2]/div[2]/div[2]/a[2]");
    By discipline = By.xpath("//div[contains(text(),'Discipline')]");
    By program = By.xpath("//body/div[@id='root']/div[2]/div[2]/div[2]/a[2]");
    By ordercode = By.xpath("//div[contains(text(),'Order Code')]");
    By analytes = By.xpath("//div[contains(text(),'Analytes')]");
    By providersModule = By.xpath("//a[contains(text(),'Providers')]");
    By catalog = By.xpath("//a[contains(text(),'Get Catalog')]");




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

    public catalog getcatalog()
    {
        return new catalog(driver, catalog);
    }



}
