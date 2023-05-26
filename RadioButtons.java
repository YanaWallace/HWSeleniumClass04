package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement r1 =driver.findElement(By.xpath("//input[@value='Male' or @name='optradio']"));
        r1.click();
        boolean r1isselected= r1.isSelected();
        System.out.println("The radio button Male has been selected : "+r1isselected);
        boolean  r1Isdisplayed = r1.isDisplayed();
        System.out.println("The radio button Male is displayed : "+r1Isdisplayed);
        boolean r1isEnabled = r1.isEnabled();
        System.out.println("The radio button Male is enabled : "+r1isEnabled);
        WebElement r2 =driver.findElement(By.xpath("input[@value='Female' and @name='optradio']"));
        r2.click();
        r1isselected=r1.isSelected();
        System.out.println("The radio button is selected : "+r1isselected);

    }
}
