package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	   
    WebDriver driver;
    @FindBy(xpath="//button[.='SIGN IN']")
    WebElement signinbutton1;

    @FindBy(xpath="//a[.='Sign up']")
    WebElement signupbutton;
    
    @FindBy(xpath="//input[@id='myName']")
    WebElement firstname;
    
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastname;
    
    @FindBy(xpath="//input[@placeholder='Enter Email']")
    WebElement email;
    
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement password;
    
    @FindBy(xpath="//input[@type='date']")
    WebElement date;
    
    @FindBy(xpath="/html/body/div/div[2]/form/div[3]/div[3]/input")
    WebElement male;
    
    @FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
    WebElement phnumber;
    
    @FindBy(xpath="//textarea[@placeholder='Short Bio']")
    WebElement bio;
    
    @FindBy(xpath="//button[.='Sign In']")
    WebElement register;
    
	 Signup(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver,this);
	}
	public void signinbutton() throws InterruptedException
	{
	  signinbutton1.click();
	  Thread.sleep(2000);
	}
	public void signupbutton() throws InterruptedException
	{
	  signupbutton.click();
	  Thread.sleep(2000);
	}
	public void fname(String fname) throws InterruptedException
	{
		firstname.sendKeys(fname);
		 Thread.sleep(2000);
	}
	public void lname(String lname) throws InterruptedException
	{
		lastname.sendKeys(lname);
		 Thread.sleep(2000);
	}
	public void email(String email1) throws InterruptedException
	{
		email.sendKeys(email1);
		 Thread.sleep(2000);
	}
	public void password(String pwd) throws InterruptedException
	{
		password.sendKeys(pwd);
		 Thread.sleep(2000);
	}
	public void date() throws InterruptedException
	{
		date.click();
		 Thread.sleep(2000);
	}
	public void radio() throws InterruptedException
	{
		male.click();
		 Thread.sleep(2000);
		System.out.println(male.isSelected());
	}
	public void phone(String phnum) throws InterruptedException
	{
		phnumber.sendKeys(phnum);
		 Thread.sleep(2000);
	}
	public void bio(String addbio) throws InterruptedException
	{
		bio.sendKeys(addbio);
		 Thread.sleep(2000);
	}
	public void register() throws InterruptedException
	{
		register.click();
		driver.switchTo().alert().accept();
		 Thread.sleep(2000);
	}
	
}
