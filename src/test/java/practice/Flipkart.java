package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
WebDriver driver =new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("//input[@name='q']")).click();
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles",Keys.ENTER);
//driver.findElement(By.xpath("//*[local-name()='svg']/*[local-name()='g']/*")).click();
Thread.sleep(2000);
  List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
 System.out.println(priceList.size());
  List<WebElement> mobilenames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
 System.out.println(mobilenames.size());
 
List<ArrayList<String>> mobileList = new ArrayList<ArrayList<String>>();
ArrayList<String> obj = new ArrayList<String>();
 for (int i = 0; i <priceList.size(); i++) {
	obj.add(mobilenames.get(i).getText());
	obj.add(priceList.get(i).getText());
}
 mobileList.add(obj);
	}

}
