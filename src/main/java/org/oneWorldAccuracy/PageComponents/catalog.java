package org.oneWorldAccuracy.PageComponents;

import org.oneWorldAccuracy.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class catalog extends AbstractComponent {
    By catalog = By.xpath("//a[contains(text(),'Get Catalog')]");


    public catalog(WebDriver driver, By catalog) {
        super(driver, catalog);
    }

    public void click() {
        findElement(catalog).click();
    }
}
