package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;


public class MyAccountPage extends WebTestBase {
	/*@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[1]/h1")
	WebElement accountTitle;*/
	
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement accountTitle;
	
	@FindBy(name="field-keywords")
	WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    WebElement submitBtn;
    
    @FindBy(xpath = "//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div")
    WebElement searchTitle;

   /* @FindBy(xpath= "//*[@id=\"a-autoid-0-announce\"]")
    WebElement dropDown;*/
    
    @FindBy(xpath= "//*[@id=\"searchDropdownBox\"]")
    WebElement dropDown;
       
    @FindBy(id = "nav-orders")
    WebElement hover;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a")
    WebElement FacebookOption;
	     
        public MyAccountPage() {
        	PageFactory.initElements(driver, this);
        }
        public String getTextOFYourAccountPage() {
        	return accountTitle.getText();
        }
  
    public void search() {
    	searchTextBox.click();
    	searchTextBox.sendKeys("Paithani saree");
    	searchTextBox.sendKeys(Keys.ENTER);
    	submitBtn.click();    		
    }
    
     
    public void selectDropDown(String term, String value){
        dropDown.click();
        Utility.selectValue(dropDown,term,value);
    }
    

    public void mouseHover(){
       Utility.mouseHover(driver,hover);
    }
    
    public String getTextOfSearch() {
    	return searchTitle.getText();//return text there in search title
    }
    
    public void scrollDownMethod() {
        Utility.scrollDownByElement(driver, FacebookOption);
        FacebookOption.click();

    }
    
    public void scrollUpMethod() {
        Utility.scrollUp(driver);
       
    }
    public void windowHandle(){
        Utility.scrollDownByElement(driver, FacebookOption);
       FacebookOption.click();
        Utility.switchToWindows(driver);
    }

    public void getCookiesHandle(){
       Utility.getCookies();
    }
}



	
