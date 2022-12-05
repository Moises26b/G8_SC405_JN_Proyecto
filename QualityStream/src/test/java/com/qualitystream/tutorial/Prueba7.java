package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prueba7 {
	
	
    private WebDriver driver;
    
    @Before
    public void setUp() {

    	System.setProperty("WebDriver.gecko.driver", "./src/test/resources/DriverJava/geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://sistemas.ufidelitas.ac.cr/nokri-demo2/");
    	
    }
   @Test
    public void testFirefoxPage() {
    	WebElement searchbox = driver.findElement(By.name("job-title"));
    	//WebElement span = driver.findElement(By.className("select2-selection__placeholder"));
    	
    	
    	searchbox.clear();
    	
    	searchbox.sendKeys("Manager");
    	
    	//searchbox.submit();
    	
    	WebElement Lista = driver.findElement(By.className("select2-selection__rendered"));
    	Lista.click();
    	
    	WebElement List = driver.findElement(By.className("select2-results__option"));
    	
    	List.click();
    	
    	Lista.submit();
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	
    }
   @After
   public void tearDown() {
	   //driver.quit();
   }
    
}

