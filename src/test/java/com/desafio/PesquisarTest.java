package com.desafio;

import java.util.List;
import java.util.concurrent.TimeUnit;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PesquisarTest {

    private WebDriver driver;
  

    @Before
    public void inicializa() {

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.webmotors.com.br/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    }

    @After
    public void finalizar(){
        driver.quit();
    }

    @Test
    public void devePesquisarMarcaModeloVersao() throws InterruptedException {
       driver.findElement(By.id("searchBar")).sendKeys("Honda");
    
       driver.findElement(By.xpath("//div[@id='WhiteBox']/div/div[2]/div/div/div/div/div/div/a/div[2]/strong")).click();
     
       driver.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]")).click();
     
       driver.findElement(By.linkText("CITY")).click();
      
       driver.findElement(By.xpath("//div[2]/div[3]")).click();

       WebDriverWait wait = new WebDriverWait(driver,20);
 
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("1.5 DX 16V FLEX 4P MANUAL")));
       driver.findElement(By.linkText("1.5 DX 16V FLEX 4P MANUAL")).click();

       
     
    }
    

 
}
