package StepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FbLoginAccount {
	
	WebDriver driver;
	@Given("User launch the application")
	public void user_lanch_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
	    
	}

	@When("User enter user name and Password")
	public void user_enter_username_and_password() {
		driver.findElement(By.name("uid")).sendKeys("mngr521222");
		driver.findElement(By.name("password")).sendKeys("qYpavUd");
		System.out.println("Enter the Username and password");
	    
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.name("btnLogin")).click();
		System.out.println("Click on Login Button");
	    
	}

	@And("close the windows")
	public void closs_the_windows() {
		driver.close();
	    
	}

}
