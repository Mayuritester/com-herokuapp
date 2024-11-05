import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

//*BaseUrl = http://the-internet.herokuapp.com/login
//1. Set up  browser.
//2. Open URL.
//3. Print the title of the page.
//4. Print the current URL.
//5. Print the page source.
//6. Enter the email in the email field.
//7. Enter the password in the password field.
//8. Click on the Login Button.
//9. Print the current URL.
//10. Refresh the page.
//11. Close the browser.
public class FireFox {
    public static void main(String[] args) {
        //Open and set URL
        String baseUrl = "http://the-internet.herokuapp.com/login";
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

//         Print the title of the page.
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
