package org.oneWorldAccuracy.PageComponents;

import org.oneWorldAccuracy.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class programModule extends AbstractComponent {
    By programModule = By.xpath("//a[@id='MENU_PROGRAMS']");



    public programModule(WebDriver driver, By programModule) {
        super(driver, programModule);
    }

    public void click() {
        findElement(programModule).click();
    }




}
