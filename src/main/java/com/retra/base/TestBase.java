package com.retra.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public Properties prop;
	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream input=new  FileInputStream("C:\\Users\\Epage\\eclipse-workspace\\Retrapersonalloan\\src\\main\\java\\com\\retra\\config\\config.properties");
			prop.load(input);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void intialization() {
		String browsername="chrome";
		if(prop.getProperty("browser").contentEquals(browsername)) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Epage\\eclipse-workspace\\Retrapersonalloan\\dri ver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
