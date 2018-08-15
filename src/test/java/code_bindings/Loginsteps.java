package code_bindings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsteps {
	WebDriver driver;
	WebElement searchbox = null;
	String PageTitle = null;
	
	@Given("^I navigate to Google home page$")
	public void setUpMeth(){
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	};

	@Given("^I enter \"([^\"]*)\" in search box$")
	public void enterMeth(String keyword){
		searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
	};

	@When("^I press enter$")
	public void enterMeth(){
		searchbox.submit();
	};

	@Then("^I get results page$")
	public void resultsMeth(){
		PageTitle = driver.getTitle();
		System.out.println(PageTitle);
	};

}
