package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class AndroidSetup {
    public WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "8.0");
        capabilities.setCapability("deviceName","Nexus 10 API 23");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app","C:\\apk\\POB-izinsiz-dev-emulator-debug.apk");

        capabilities.setCapability("autoAcceptAlerts", true);
        capabilities.setCapability("autoGrantPermissions", true);


        capabilities.setCapability("appPackage", "***");
// This package name of your app (you can get it from apk info app)
        capabilities.setCapability("appActivity","***"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
        //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
        driver = new RemoteWebDriver(new URL("***"), capabilities);
        //driver.switchTo().alert().dismiss();
     //   driver.switchTo().alert().accept();

    }

    @Test
    public void testCal() throws Exception {
        //locate the Text on the calculator by using By.name()
        /*
        WebElement allowButton = driver.findElements(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button'])"));
        allowButton.click();*/
     //   driver.switchTo().alert().accept();
        WebElement two=driver.findElement(By.id("***"));
        two.click();

        WebElement   sayfa = driver.findElement(By.xpath("***"));
        sayfa.click();


      //  two.wait(5000);
        /*
        WebElement plus=driver.findElement(By.name("+"));
        plus.click();
        WebElement four=driver.findElement(By.name("4"));
        four.click();
        WebElement equalTo=driver.findElement(By.name("="));
        equalTo.click();
        //locate the edit box of the calculator by using By.tagName()
        WebElement results=driver.findElement(By.tagName("EditText"));
        //Check the calculated value on the edit box
        assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";
*/
    }

/*    @AfterClass
    public void teardown(){
        //close the app

        driver.quit();
    }*/


    }
