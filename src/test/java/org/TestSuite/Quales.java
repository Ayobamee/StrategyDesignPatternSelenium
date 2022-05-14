package org.TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Quales {

    WebDriver driver;
     Properties prop;
    @Test
    public void joinQuales() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//utilities//datadriven.properties");
        prop.load(fis);

        if (prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver101");
            driver = new ChromeDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.quales.tech/");
        driver.findElement(By.cssSelector(".ht-btn.header-btn[href='learning.html']")).click();
        driver.findElement(By.cssSelector("a[href='https://forms.gle/TGnutAjkUW9xmovDA']")).click();

    }


}
