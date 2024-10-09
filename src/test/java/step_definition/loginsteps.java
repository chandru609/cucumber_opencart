package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

    WebDriver driver = new ChromeDriver();	
	
	@Given("^user is on the login page$")
	public void loginpage() {
		driver.navigate().to("https://demo.opencart.com/en-gb?route=account/login");
		System.out.println("login page opened");
		
	}
	
	@When("^user enters a valid username and password$")
	public void userandpassword() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("pavanol123@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("login completed");
	}
	
	@Then("^user is redirected to the homepage$")
	public void userisredirectedtothehomepage() {
		System.out.println("home page opened");
	}
		
}

