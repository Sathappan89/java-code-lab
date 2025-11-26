package EncapsulationConcept;

public class BrowserTest {

	public static void main(String[] args) {
		Browser br = new Browser();
		
		br.launchBrowser();

		// public click()-->
		// -->private check locator()-->wait()-->elementPresent()-->runjs-->clieck on
		// the element

		// public sendKeys()-->private 1 to 10-->
		
		Util.checkLastestUpdated();
		Util.checkOSCompatible();
		
		//Util u1=new Util();
		
		System.getProperties();
	}

	
}