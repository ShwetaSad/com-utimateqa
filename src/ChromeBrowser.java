import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    /*
    Project-5 - ProjectName: com-utimateqa
BaseUrl = https://courses.ultimateqa.com/
1. Set up Chrome browser.
2. Open URL.
3. Print the title of the page.
4. Print the current URL.
5. Print the page source.
6. Click on the ‘Sign In’ link
7. Print the current URL
8. Enter the email in the email field.
9. Enter the password in the password field.
10. Click on the Login Button.
11. Navigate to baseUrl.
12. Navigate forward to the Homepage.
13. Navigate back to baseUrl.
14. Refresh the page.
15. Close the browser.
     */
    public static void main(String[] args) {
        //Set up Chrome Browser
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://courses.ultimateqa.com/";
        //Open URL
        driver.get(baseUrl);
        //Print the Tilte of the Page
        System.out.println("The Title of the page is: " + driver.getTitle());
        // Print the current URL
        System.out.println("The Curent Url  is: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("the Source of the page is: " + driver.getPageSource());
        // Click on the Sign in Link
        WebElement signIn = driver.findElement(By.linkText("Sign In"));
        signIn.click();
        // Print the current Url
        System.out.println("The Current Url is: " + driver.getCurrentUrl());
        //Enter Email in Email id Field
        WebElement Email = driver.findElement(By.id("user[email]"));
        Email.sendKeys("ss@gmail.com");
        //Enter Password
        WebElement Password = driver.findElement(By.id("user[password]"));
        Password.sendKeys("ss");
        // Click on the Login Button
        driver.findElement(By.linkText("Sign In")).click();
        //Navigate to Base Url
        driver.navigate().to(baseUrl);
        //Navigate Forward
        driver.navigate().forward();
        // navigate back to Base url
        driver.navigate().to(baseUrl);
        //refresh the page
        driver.navigate().refresh();
        // close the browser
        driver.quit();


    }
}
