package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class visual_user {
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

        username.sendKeys("visual_user");
        password.sendKeys("secret_sauce");
        buttonLogin.click();

        //Filter
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement comboBoxFilter = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        WebElement comboBoxFilterItem = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[3]"));

        comboBoxFilter.click();
        comboBoxFilterItem.click();

        //PageAllItemAddCart
        WebElement buttonAddCartCard1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
        WebElement buttpmAddCartCard2 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/button"));

        buttonAddCartCard1.click();
        buttpmAddCartCard2.click();

        //DetailItemWithTitle
        WebElement TitleItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div"));
        TitleItem.click();

        //Return
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement buttonReturnItem = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/button"));
        buttonReturnItem.click();

        //DetailItemWithPicture
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement PictureItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[1]/a"));
        PictureItem.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement AddCartItemDetail = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/button"));
        AddCartItemDetail.click();

        //Cart
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement buttonCart = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        buttonCart.click();
        //--RemoveCart
        WebElement buttonItemCartRemove = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/button"));
        buttonItemCartRemove.click();

        //CheckOut
        WebElement buttonCheckOut = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]"));
        buttonCheckOut.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement inputNameCheckOut = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input"));
        WebElement inputLastNameCheckOut = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input"));
        WebElement inputZipCodeCheckOut = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input"));
        WebElement buttonCheckOutContinue = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input"));

        inputNameCheckOut.sendKeys("Renzo");
        inputLastNameCheckOut.sendKeys("Palomino");
        inputZipCodeCheckOut.sendKeys("15048");
        buttonCheckOutContinue.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement buttonCheckOutFinish = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]"));
        buttonCheckOutFinish.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement buttonCheckOutBackHome = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/button"));
        buttonCheckOutBackHome.click();

        //Logout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement buttonHamburgerSideMenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button"));
        buttonHamburgerSideMenu.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement buttonSideMenuLogout = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]"));
        buttonSideMenuLogout.click();

        //CloseChrome
        driver.close();
        driver.quit();
    }
}
