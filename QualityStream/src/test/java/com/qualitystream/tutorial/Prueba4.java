package com.quality;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba4 {
	
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
       WebElement home = driver.findElement(By.linkText("Login"));
       home.click();
       
   	WebElement searchbox = driver.findElement(By.id("sb_reg_email"));
   	
   	searchbox.clear();
   	
   	searchbox.sendKeys("les_rium@hotmail.com");
   
   	WebElement pass = driver.findElement(By.id("sb_reg_password"));
   	
   	pass.clear();
   	
   	pass.sendKeys("ProyectoCS8");
   	
    WebElement log = driver.findElement(By.id("sb_login_submit"));
    log.click();
   	
   
   }
   @After
    public void tearDown() {
        driver.quit();
    }

}
