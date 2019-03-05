package today.bookit.tests.functional;

import org.testng.annotations.Test;

import today.bookit.utils.ConfigurationReader;
import today.bookit.utils.TestBase;

public class LoginTests extends TestBase {
	
	@Test
	public void loginTest() {
		String username = ConfigurationReader.getProperty("email");
		String password = ConfigurationReader.getProperty("password");
		extentLogger = report.createTest("Login as team lead");
	 	extentLogger.info("Entering login information");
	 	pages.signin().login(username, password);
	}

}
