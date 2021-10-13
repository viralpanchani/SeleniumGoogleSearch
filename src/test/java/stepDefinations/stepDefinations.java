package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinations {
	WebDriver driver;
	

@Given("^open Webpage")
public void open_webpage() {
	System.setProperty("webdriver.chrome.driver","/Users/viral/Downloads/chromedriver");	
	driver=new ChromeDriver();
	driver.get("https://www.google.com"); 
}
@When("enter value in searchbox {string}")
public void enter_value_in_searchbox(String string) {
	driver.findElement(By.xpath("//*[@class='gLFyf gsfi' and @title='Search']")).sendKeys(string);
}
@Then("click on submit button")
public void click_on_button() {
	driver.findElement(By.xpath("//*[@class='gLFyf gsfi' and @title='Search']")).sendKeys(Keys.ENTER);;
}


}
