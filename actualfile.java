package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class actualfile {
	WebDriver driver;
	
	@Given("user is on homepage")
	public void user_is_on_homepage()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.28\\Desktop\\kri\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div/ul/li[1]/a")).click();
		
		
		
	}
	
	@When("Users enters username {string}")
	public void user_enters_username(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
		
		
		
		
	}
	
	@Then("user enters Password {string}")
	public void user_enters_Password(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);

	}
	
	
	@Then("User should be logged in and verify.")
	public void user_should_be_logged_in_and_verify() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		
	}
	
	
	@Given("navigate to all categories-Electronics and headphone")
	public void navigate_to_all_categories_Electronics_and_headphone() {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("headphone");
	//	driver.findElement(By.xpath(xpathExpression)).click();
		
		
	}
	
	@Given("add to cart the selected checkouts")
	public void add_to_cart_the_selected_checkouts()

	{
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/center/a")).click();
	}
	
	@When("get into checkout page")
	public void get_into_checkout_page() {
		//driver.findElement(By.xpath(xpathExpression));
		
	}
	
	@When("make some payment and add creditials")
	public void make_some_payments_and_add_creditials() {
		
		//driver.findElement(By.xpath(xpathExpression));
	}
	
	@Then("redirected into the thankyoupage")
	public void redirected_into_the_thankyoupage()
	{
		//driver.findElement(By.xpath());
	}

}
