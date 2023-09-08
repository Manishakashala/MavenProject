package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class HomePage extends WebTestBase{
	@FindBy(xpath= "//*[@id=\"nav-link-accountList\"]/span")
    WebElement AccountSignin;
	
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void SigninClick(){
        AccountSignin.click();
   
    }
	

}




