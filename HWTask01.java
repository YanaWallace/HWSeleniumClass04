package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWTask01 {
    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
            driver.manage().window().maximize();

            WebElement selectDay = driver.findElement(By.xpath("//select[@id='select-demo']"));
            selectDay.click();

            Select sel = new Select(selectDay);

            sel.selectByVisibleText("Tuesday");
            Thread.sleep(1000);
            sel.selectByValue("Thursday");
            Thread.sleep(1000);
            sel.selectByIndex(6);
            Thread.sleep(1000);

            driver.quit();
        }
    }

