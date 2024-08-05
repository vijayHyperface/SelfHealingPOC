import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {


    @Test
    public void launch() throws InterruptedException {

        WebDriver delegate = new ChromeDriver();
        SelfHealingDriver driver = SelfHealingDriver.create(delegate);
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(5000);
        driver.findElement(By.className("gLFyf")).sendKeys("8765678");
        driver.findElement(By.linkText("Gmail")).click();
    }
}
