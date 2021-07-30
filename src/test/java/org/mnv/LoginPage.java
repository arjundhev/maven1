package org.mnv;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		@CacheLookup
	    @FindAll({@FindBy(id="username"),@FindBy(xpath="//input[@name='login']")})
	    private WebElement txtUserName;
		
		@FindBy(id="password")
		private WebElement txtPassword;
		
		@FindBy(name="login")
		private WebElement btnLogin;
		
		public WebElement getTxtUserName() {
			return txtUserName;
			
		}
		public WebElement getTxtPassword() {
			return txtPassword;
		}
		
		public WebElement getBtnLogin() {
			return btnLogin;
		}
		
		

	   
	    

}
