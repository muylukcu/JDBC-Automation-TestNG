package today.bookit.tests.functional;

import org.testng.Assert;
import org.testng.annotations.Test;

import today.bookit.utils.ConfigurationReader;
import today.bookit.utils.DBUtils;
import today.bookit.utils.TestBase;

public class ReservationTests extends TestBase {
	
	@Test
	public void reserveConference() {
		//test data
		String date = "March 5, 2019";
		String from = "2:00pm";
		String to = "4:00pm";
		String room = "yale";
		//test data from properties file
		String username = ConfigurationReader.getProperty("email");
		String password = ConfigurationReader.getProperty("password");
		extentLogger = report.createTest("As user I ant to be able to reserve a conference");
	 	extentLogger.info("Entering login information");
	 	pages.signin().login(username, password);
	 	extentLogger.info("Click on hunt");
	 	pages.map().goToHunt();
	 	extentLogger.info("Find available for date: "+date+" from: "+from+" to: "+to);
	 	pages.hunt().findAvailabeRooms(date, from, to);
	 	extentLogger.info("Resrver a room: "+room);
	 	pages.hunt().reserveConference(room);
	 	extentLogger.info("Go to general schedule");
	 	pages.map().goToGeneralSchedule();
	 	extentLogger.info("Verify that conference has been created for specific student");
	 	Assert.assertTrue(DBUtils.verifyConferenceHasBeenCraeted("Sharron", "Chin", date));
	 	
	}
}
