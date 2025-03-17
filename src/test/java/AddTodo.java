import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTodo {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://todo.qacart.com/login");
        driver.findElement(By.cssSelector("[data-testID=email]")).sendKeys("khalid76@gmail.com");
        driver.findElement(By.cssSelector("[data-testID=password]")).sendKeys("test1234");
        driver.findElement(By.cssSelector("[data-testID=submit]")).click();
        driver.findElement(By.cssSelector("[data-testID=add]")).click();
        driver.findElement(By.cssSelector("[data-testID=new-todo]")).sendKeys("task1");
        driver.findElement(By.cssSelector("[data-testID=submit-newTask]")).click();


    }
}
