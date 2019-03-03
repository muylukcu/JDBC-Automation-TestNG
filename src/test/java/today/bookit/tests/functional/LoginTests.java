package today.bookit.tests.functional;

import org.testng.annotations.Test;

import today.bookit.utils.TestBase;

public class LoginTests extends TestBase {
	
	@Test
	public void loginTest() {
		pages.signin().openHomePage();
		extentLogger = report.createTest("Login as team lead");
	 	extentLogger.info("Entering login information");
	}

}
