package today.bookit.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import today.bookit.utils.BrowserUtils;
import today.bookit.utils.ConfigurationReader;
import today.bookit.utils.Driver;

public class SignInPage {
	public static final Logger logger = LogManager.getLogger();

	public SignInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(css = "input[name*='email']")
	private WebElement email;

	@FindBy(css = "input[name*='password']")
	private WebElement password;

	@FindBy(css = "button[type*='submit']")
	private WebElement signIn;

	@FindBy(xpath = "//h1[.='sign in']")
	private WebElement homepagesignIntext;

	public void openHomePage() {
		System.out.println(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
		Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
	}

	public void login(String emailStr, String passwordStr) {
		BrowserUtils.takeSnapShot();
		BrowserUtils.waitForVisibility(email, 20);
		email.clear();
		email.sendKeys(emailStr);
		password.clear();
		password.sendKeys(passwordStr);
		signIn.click();
		logger.debug(String.format("Loging with email %s and password %s", emailStr, passwordStr));
	}

	public String getUserEmail(String role, String location) {
		return ConfigurationReader
				.getProperty(role + "email" + location + ConfigurationReader.getProperty("environment"));
	}

	public String getUserPassword(String role, String location) {
		return ConfigurationReader
				.getProperty(role + "password" + location + ConfigurationReader.getProperty("environment"));
	}

}
