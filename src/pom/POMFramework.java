package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMFramework extends BasePage implements AutoConstant
{
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;
		
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailTextfield;
	
	@FindBy(xpath="(//input[@name='gender'])[1]")
	private WebElement maleradioButton;
	
	@FindBy(xpath="(//input[@name='gender'])[2]")
	private WebElement femaleradioButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement remembermeCheckbox;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countrycodeDropdownlist;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobileNoTextField;
	
	@FindBy(xpath="//textarea")
	private WebElement addresstextArea;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement saveButton;
	
	
	public POMFramework(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	public void formSubmit() throws IOException
	{
		String fn = ExcelLibrary.getCellValue(excel_path, "sheet1", 1, 0);
		firstnameTextfield.sendKeys(fn);
		
		String ln = ExcelLibrary.getCellValue(excel_path, "sheet1", 1, 1);
		lastnameTextfield.sendKeys(ln);
		
		String un = ExcelLibrary.getCellValue(excel_path, "sheet1", 1, 2);
		usernameTextfield.sendKeys(un);
		
		String pwd = ExcelLibrary.getCellValue(excel_path, "sheet1", 1, 3);
		passwordTextfield.sendKeys(pwd);
		
		String email = ExcelLibrary.getCellValue(excel_path, "sheet1", 1, 4);
		emailTextfield.sendKeys(email);
		
		maleradioButton.click();
		remembermeCheckbox.click();
		
		dropdownbyvisibletext(countrycodeDropdownlist, "+91");
		
		String mob = ExcelLibrary.getCellValue(excel_path, "sheet1", 1, 5);
		mobileNoTextField.sendKeys(mob);
		
		String add = ExcelLibrary.getCellValue(excel_path, "sheet1", 1, 6);
		addresstextArea.sendKeys(add);
		
	}
	
	
	
	
}
