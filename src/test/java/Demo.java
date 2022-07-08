import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testportal.netfinans.com/auth/sign-in");
        driver.findElement(By.id("username")).sendKeys("ecozumtest@10dk.email");
        driver.findElement(By.id("password")).sendKeys("Admin123!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
