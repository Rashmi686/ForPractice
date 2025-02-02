import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cls {

	public static void main(String[] args) throws InterruptedException {
		                //ascending//
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.linkText("Help")).click();
		Set<String> ids=driver.getWindowHandles();
		System.out.println(ids);
		Object[] win=ids.toArray();
		String win1=win[0].toString();
		String win2=win[1].toString();
		driver.switchTo().window(win2);
	}
}