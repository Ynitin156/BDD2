package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 
{
	WebDriver d2;

	@Given("open the chrome browser and url of the application")
	public void open_the_chrome_browser_and_url_of_the_application() 
	{
		System.out.println("Given Start");
		
		System.setProperty("webdriver.chrome.driver","E:\\newautomation\\chromedriverr.exe");
		d2 = new ChromeDriver();
		d2.get("https://www.instagram.com/");
		d2.manage().window().maximize();
		d2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("Enter valid login id and password nd click on login button")
	public void enter_valid_login_id_and_password_nd_click_on_login_button() 
	{
		System.out.println("When Start");
		
	    d2.findElement(By.name("username")).sendKeys("beingnitinyadav");
	    d2.findElement(By.name("password")).sendKeys("Quantum@24");
	    d2.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();;
		
	}

	@Then("succesfully login & Home page open")
	public void succesfully_login_home_page_open() 
	{
		System.out.println("Then Start");
		
	   System.out.println("succesfully login & Home page open");
		
	}

	

}
