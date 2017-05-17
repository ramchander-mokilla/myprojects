package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	String url = "https://www.walmart.com/";
	
	@FindBy(xpath="//input[@id='global-search-input']")
	WebElement searchBox; 
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy(id="emailId")
	WebElement emailID;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement signUpButton; 
	
	@FindBy(xpath="//a[@title='Privacy Policy']")
	WebElement privacyPolicy;
	
	@FindBy(linkText="Track Orders")
	WebElement trackOrdersLink;
	
	@FindBy(xpath="//a[@href='https://help.walmart.com/']") 
	WebElement helpButton;
	
	@FindBy(css="button[data-tl-id='header-GlobalAccountFlyout-link']")
	WebElement myAccountDropDown;
	
	@FindBy(className="elc-icon elc-icon-cart")
	WebElement shoppingCart;
	
	@FindBy(css="a[title='Terms of Use']")
	WebElement termsOfUseLink;
	
	@FindBy(css="a[title='Careers']")
	WebElement careersLink;
	
	@FindBy(css="a[title='Returns Policy']")
	WebElement returnsPolicyLink;
	
	@FindBy(css="div[class='header-GlobalEyebrowNav text-right font-semibold']")
	WebElement header; 
	
	public WebDriver openHomePage(WebDriver driver)
	{
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebElement searchBox()
	{
		return searchBox;
	}
	
	public WebElement submitButton()
	{
		return submitButton;
	}
	
	public WebElement emailID()
	{
		return emailID;
	}
	
	public WebElement signUpButton()
	{
		return signUpButton;
	}
	
	public WebElement privacyPolicy()
	{
		return privacyPolicy;
	}
	
	public WebElement trackOrdersLink()
	{
		return trackOrdersLink;
	}
	
	public WebElement helpButton()
	{
		return helpButton;
	}

	public WebElement myAccountDropDown()
	{
		return myAccountDropDown;
	}
	
	public WebElement shoppingCart()
	{
		return shoppingCart;
	}
	
	public WebElement termsOfUseLink()
	{
		return termsOfUseLink;
	}
	
	public WebElement careersLink()
	{
		return careersLink;
	}
	
	public WebElement returnsPolicyLink()
	{
		return returnsPolicyLink;
	}
	
	public WebElement header()
	{
		return header;
	}
}
