package org.oneWorldAccuracy.PageComponents;

import org.oneWorldAccuracy.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class program extends AbstractComponent {


    By discipline = By.xpath("//div[contains(text(),'Discipline')]");
    By program = By.xpath("//div[contains(text(),'Program')]");
    By ordercode = By.xpath("//div[contains(text(),'Order Code')]");
    By analytes = By.xpath("//div[contains(text(),'Analytes')]");


    public program(WebDriver driver, By continueElement) {
        super(driver, continueElement);
    }


    public boolean checkdiscipline ()
    {
        findElement(discipline);
        return true;
    }


    public boolean checkprogram ()
    {
        findElement(program);
        return true;
    }

    public boolean checkordercode ()
    {
        findElement(ordercode);
        return true;
    }


    public boolean checkanalytes ()
    {
        findElement(analytes);
        return true;
    }
}
