package seli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();

		/*drive.get(https://www.numpyninja.com/contact);
		WebElement frstNameTxtBox = driver.findElement(By.name("first-name"));
		frstNameTxtBox.sendKeys("vijaya");
		WebElement lastNameTxtBox = driver.findElement(By.name("last-name"));
		lastNameTxtBox.sendKeys("bharathi");
		
		WebElement email = driver.findElement(By.id("input_comp-l1c0ku03"));
		email.sendKeys("vijaya@bharathi.com");
		
		WebElement phone = driver.findElement(By.id("input_comp-l1c0ku05"));
		phone.sendKeys("657898769");
		
		WebElement enquiryTxt = driver.findElement(By.id("textarea_comp-l1c0ku07"));
		enquiryTxt.sendKeys("when next SET batch will start ?");
		
		WebElement sendBtn = driver.findElement(By.id("comp-l1c0ku0e3"));
		sendBtn.submit();*/
		
		driver.get("https://www.numpyninja.com/contact");
		WebElement firstNameTxtBox=driver.findElement(By.name("first-name"));
		
		
	}

}
