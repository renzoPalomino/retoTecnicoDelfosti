package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locked_out_user {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Katty\\IdeaProjects\\automatizacion\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        //Login
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input"));
        WebElement buttonLogin = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input"));

        username.sendKeys("locked_out_user");
        password.sendKeys("secret_sauce");
        buttonLogin.click();
    }
}
