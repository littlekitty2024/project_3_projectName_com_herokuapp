package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi_Browser {
    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        }
        //3.1 - Setup Chrome browser.
        WebDriver driver = new ChromeDriver();

        //3.2 - Open URL.
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3.3 - Print the title of the page.
        System.out.println("Title of the page is:" + driver.getTitle());

        //3.4 - Print the current url.
        System.out.println(driver.getCurrentUrl());

        //3.5 - Print the page source.
        System.out.println(driver.getPageSource());

        //3.6 - Enter the email to email field.
        driver.findElement(By.id("username")).sendKeys("beenarani5504@gmail.com");

        //3.7 - Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("Password");

        //3.8 -  Click on Login Button.
        driver.findElement(By.tagName("button")).click();

        //3.9 - Print the current url.
        System.out.println(driver.getCurrentUrl());

        //3.10 - Refresh the page.
        driver.navigate().refresh();

        //3.11 - Close the browser.
        driver.quit();

    }
}
