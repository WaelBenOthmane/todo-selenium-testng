package com.todos.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BasePage {

	public static WebDriver driver;
	public static Properties prop;

	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/com/todos/configs/config.properties");
		prop.load(fis);
	}

	public static void initialization(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeoptions = new ChromeOptions();
			driver = new ChromeDriver(chromeoptions);
			

		}

		else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxProfile firefoxprofile = new FirefoxProfile();
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.setCapability("platform", Platform.WIN10);
			firefoxoptions.setProfile(firefoxprofile);
			driver = new FirefoxDriver(firefoxoptions);
			
		}

		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

	}

}
