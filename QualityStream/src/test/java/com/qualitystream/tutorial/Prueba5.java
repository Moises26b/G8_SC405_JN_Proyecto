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


public class Prueba5 {
	
	
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
    	
    	searchbox.clear();
    	
    	searchbox.sendKeys("Manager");
    	
    	searchbox.submit();
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	
    }
   @After
   public void tearDown() {
	   //driver.quit();
   }
    
}

