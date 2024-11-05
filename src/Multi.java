import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi {
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
        } else {
            System.out.println("Wrong Browser name");
        }

        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        //Print the title of the page.
        System.out.println(driver.getTitle());

//        Print the current URL.
        System.out.println(driver.getCurrentUrl());
//        Print the page source.
        System.out.println(driver.getPageSource());
//        Enter the email in the email field.
        WebElement emailinput = driver.findElement(By.id("username"));
        emailinput.sendKeys("tester@gmail.com");
//        Enter the password in the password field.
        WebElement passwordinput = driver.findElement(By.id("password"));
        passwordinput.sendKeys("password");
//        Click on the Login Button.
        WebElement loginlink = driver.findElement(By.tagName("i"));
        loginlink.click();
//        Print the current URL.
        System.out.println(driver.getCurrentUrl());
//        Refresh the page.
        driver.navigate().refresh();
//        Close the browser.
        driver.close();
    }
}



