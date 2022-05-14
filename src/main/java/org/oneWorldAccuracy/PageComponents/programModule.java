package org.oneWorldAccuracy.PageComponents;

import org.oneWorldAccuracy.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class programModule extends AbstractComponent {
    By programModule = By.xpath("//body/div[@id='root']/div[2]/div[2]/div[2]/a[2]");



    public programModule(WebDriver driver, By programModule) {
        super(driver, programModule);
    }

    public void click() {
        findElement(programModule).click();
    }




}
