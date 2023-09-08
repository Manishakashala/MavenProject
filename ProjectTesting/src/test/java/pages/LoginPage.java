package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class LoginPage extends WebTestBase{
	 
    @FindBy(xpath= "//*[@id=\"ap_email\"]")
    WebElement emailorphoneTextBox;
    
    @FindBy(className="a-button-input")
    WebElement continuebtn;
 
    @FindBy(xpath="//*[@id=\"ap_password\"]")
    WebElement passwordTextBox;
    
    
    @FindBy(id="signInSubmit")
    WebElement SignInbtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    //sending the mobile no and password to the textbox to login
    public void Amazlogin(String phoneno, String password){        
        emailorphoneTextBox.sendKeys(phoneno);
        continuebtn.click();
        passwordTextBox.sendKeys(password);
        SignInbtn.click();
        
    }
	
		
}

