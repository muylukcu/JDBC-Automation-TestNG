package today.bookit.utils;

import today.bookit.pages.HuntPage;
import today.bookit.pages.MapPage;
import today.bookit.pages.MySelfPage;
import today.bookit.pages.MyTeamPage;
import today.bookit.pages.RoomPage;
import today.bookit.pages.SchedulePage;
import today.bookit.pages.SignInPage;

public class Pages {
	private SignInPage signInPage;
	private SchedulePage schedulePage;
	private RoomPage roomPage;
	private MyTeamPage myTeamPage;
	private MySelfPage mySelfPage;
	private MapPage mapPage;
	private HuntPage huntPage;

	public SignInPage signin() {
		if (signInPage == null) {
			signInPage = new SignInPage();
		}
		return signInPage;
	}

	public SchedulePage schedule() {
		if (schedulePage == null) {
			schedulePage = new SchedulePage();
		}
		return schedulePage;
	}

	public RoomPage room() {
		if (roomPage == null) {
			roomPage = new RoomPage();
		}
		return roomPage;
	}

	public MyTeamPage myTeam() {
		if (myTeamPage == null) {
			myTeamPage = new MyTeamPage();
		}
		return myTeamPage;
	}

	public MySelfPage mySelf() {
		if (mySelfPage == null) {
			mySelfPage = new MySelfPage();
		}
		return mySelfPage;
	}
	
	public MapPage map() {
		if (mapPage == null) {
			mapPage = new MapPage();
		}
		return mapPage;
	}
	
	public HuntPage hunt() {
		if (huntPage == null) {
			huntPage = new HuntPage();
		}
		return huntPage;
	}
}
