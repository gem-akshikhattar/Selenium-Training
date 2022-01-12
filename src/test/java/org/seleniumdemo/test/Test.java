package org.seleniumdemo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
    WebDriver driver = new ChromeDriver();					
    driver.get("http://demo.guru99.com/test/radio.html");	
    WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

    // This will Toggle the Check box 		
    option1.click();			

    // Check whether the Check box is toggled on 		
    if (option1.isSelected()) {					
        System.out.println("Checkbox is Toggled On");					

    } else {			
        System.out.println("Checkbox is Toggled Off");					
    }	
}
}
