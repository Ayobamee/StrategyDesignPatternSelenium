package org.oneWorldAccuracy.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.oneWorldAccuracy.AbstractComponents.AbstractComponent;

public class loginAlert extends AbstractComponent {
    WebDriver driver;
    By loginAlert = By.xpath("//body/div[@id='root']/div[1]/div[1]/a[1]/div[1]/div[2]");
    By EQA = By.xpath("//h1[contains(text(),'CREATE EQA PROGRAMS')]");
    public loginAlert(WebDriver driver, By loginAlert) {
        super(driver, loginAlert);
    }

    public boolean checkCovid()
    {
        findElement(loginAlert);
        return true;
    }

    public boolean checkEQA ()
    {
        findElement(EQA);
        return true;
    }
}
