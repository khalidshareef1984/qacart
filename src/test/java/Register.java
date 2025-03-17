import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();

        driver.get("https://todo.qacart.com/signup");

        driver.findElement(By.cssSelector("[data-testID=first-name]")).sendKeys("khalid");
        driver.findElement(By.cssSelector("[data-testID=last-name]")).sendKeys("abd");
        driver.findElement(By.cssSelector("[data-testID=email]")).sendKeys("khalid76@gmail.com");
        driver.findElement(By.cssSelector("[data-testID=password]")).sendKeys("test1234");
        driver.findElement(By.cssSelector("[data-testID=confirm-password]")).sendKeys("test1234");
        driver.findElement(By.cssSelector("[data-testID=submit]")).click();

    }
}
