import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void cssSelectorTagsPractice(WebDriver webDriver){

            //tag#id ---> tag.id
            // boolean isDisplay = webDriver.findElement(By.cssSelector("div#stUuGf")).isDisplayed();
            //             System.out.println(isDisplay);

            //tag.classname---> tag.classname
            // boolean isDisplay = webDriver.findElement(By.cssSelector("div.SDkEP")).isDisplayed();
            //             System.out.println(isDisplay);

            //tag -attributes ---> tag[id='classId']
            //webDriver.findElement(By.cssSelector("textarea[id='APjFqb']")).sendKeys("amazon");

            //tag class attributes ---> tag.classnamae[id="id of class"] can remove tag but keep .
            //webDriver.findElement(By.cssSelector("textarea.gLFyf[id='APjFqb']")).sendKeys("netflix");;
            
            
    }

    public static void main(String[] args) {
            
            WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
            driver.get("https://www.google.com");
       // WebElement searchbar =   driver.findElement(By.className("gLFyf"));
       // System.out.println(searchbar);
        //searchbar.click();
       // searchbar.sendKeys("www.amazon.com");
       //   searchbar.submit();
       //xList<WebElement> links = driver.findElements(By.tagName("a")); 
        //return list of webelements if found single it return only one is return
        // for (WebElement webElement : links) {
        //     System.out.println(webElement);
        // }
      
        cssSelectorTagsPractice(driver);

    }
}
