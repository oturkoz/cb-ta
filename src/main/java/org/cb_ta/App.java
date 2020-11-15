package org.cb_ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","webdrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://codingbook.org");
        
    }
}
