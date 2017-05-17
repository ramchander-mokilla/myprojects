package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	String url = "https://www.walmart.com/";
	
	By searchBox = By.xpath("//input[@id='global-search-input']");
	By submitButton = By.xpath("//button[@type='submit']");
	By emailID = By.id("emailId");
	By signUpButton = By.xpath("//button[@class='btn btn-primary']");
	By privacyPolicy = By.xpath("//a[@title='Privacy Policy']");
	By trackOrdersLink = By.linkText("Track Orders");
	By helpButton = By.xpath("//a[@href='https://help.walmart.com/']");
	By myAccountDropDown = By.cssSelector("button[data-tl-id='header-GlobalAccountFlyout-link']");
	By shoppingCart = By.className("elc-icon elc-icon-cart");
	By termsOfUseLink = By.cssSelector("a[title='Terms of Use']");
	By careersLink = By.cssSelector("a[title='Careers']");
	By returnsPolicyLink = By.cssSelector("a[title='Returns Policy']");	
	By header = By.cssSelector("div[class='header-GlobalEyebrowNav text-right font-semibold']");
	
	public WebDriver openHomePage(WebDriver driver)
	{
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebElement searchBox()
	{
		return driver.findElement(searchBox);
	}
	
	public WebElement submitButton()
	{
		return driver.findElement(submitButton);
	}
	
	public WebElement emailID()
	{
		return driver.findElement(emailID);
	}
	
	public WebElement signUpButton()
	{
		return driver.findElement(signUpButton);
	}
	
	public WebElement privacyPolicy()
	{
		return driver.findElement(privacyPolicy);
	}
	
	public WebElement trackOrdersLink()
	{
		return driver.findElement(trackOrdersLink);
	}
	
	public WebElement helpButton()
	{
		return driver.findElement(helpButton);
	}

	public WebElement myAccountDropDown()
	{
		return driver.findElement(myAccountDropDown);
	}
	
	public WebElement shoppingCart()
	{
		return driver.findElement(shoppingCart);
	}
	
	public WebElement termsOfUseLink()
	{
		return driver.findElement(termsOfUseLink);
	}
	
	public WebElement careersLink()
	{
		return driver.findElement(careersLink);
	}
	
	public WebElement returnsPolicyLink()
	{
		return driver.findElement(returnsPolicyLink);
	}
	
	public WebElement header()
	{
		return driver.findElement(header);
	}
}
