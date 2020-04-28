package Table;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/newtours/index.php");
		
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		
		//Going to load all the Anchor <a>tag into to list
		
		List<WebElement> anchorTags = table.findElements(By.tagName("a"));
		
		//Traverse it all
		//Using Foreach loop
		for(WebElement tag: anchorTags) {
			if(tag.getText().equals("Hotels")) {
				tag.click();
				break;
			}
			
		}
		

	}

}
