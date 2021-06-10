package org.oneWorldAccuracy.PageComponents;

import org.oneWorldAccuracy.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class providersModule extends AbstractComponent {
    By providersModule = By.xpath("//a[contains(text(),'Providers')]");


    public providersModule(WebDriver driver, By providersModule) {
        super(driver, providersModule);
    }

    public void click() {
        findElement(providersModule).click();
    }


}
