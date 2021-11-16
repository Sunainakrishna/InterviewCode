package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home {
	
	 WebDriver driver;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Bank')]")
	WebElement blogin;
	
	@FindBy(xpath="//div[@class='center']//button[1]")
	WebElement addcus;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement fname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lname;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	WebElement pcode;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement submit;
	
	@FindBy(xpath="//div[@class='center']//button[2]")
	WebElement openAccount;
	
	@FindBy(xpath="//select[@id='userSelect']")
	WebElement uselec;
	
	@FindBy(xpath="//select[@id='currency']")
	WebElement cur;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement pro;
	
	
	public void loginButton()
	{
		blogin.click();
	}
	
	public void addcust()
	{
		addcus.click();
	}
	public void firstname(String name)
	{
		fname.sendKeys(name);
	}
	public void lastname(String lname1)
	{
		lname.sendKeys(lname1);
	}
	public void postalcode(String poscode)
	{
		pcode.sendKeys(poscode);
	}
	
	public void submitButton()
	{
		submit.click();
	}
	
	public void alert1()
	{
		driver.switchTo().alert().accept();
	}
	
	public void opeenacc()
	{
		openAccount.click();
	}
	
	public void custDrop()
	{
		Select s=new Select(uselec);
		s.selectByVisibleText("Sunaina K");
	}
	public void curDrop()
	{
		Select s=new Select(cur);
		s.selectByVisibleText("Rupee");
	}
	
	public void proButton()
	{
		pro.click();
	}
	

}
