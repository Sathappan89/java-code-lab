package EncapsulationConcept;

public class Browser {

	public void launchBrowser() {
		System.out.println("launch browser");
		checkVersion();
		checkLatestUpdated();
		checkOSCpmpatiable();
	}

	private void checkVersion() {
		System.out.println("check checkV ersion");
	}

	private void checkLatestUpdated() {
		System.out.println("checking latest update");
	}

	private void checkOSCpmpatiable() {
		System.out.println("checkOSCpmpatiable");
	}

}