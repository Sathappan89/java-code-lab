package FunctionsConcept;

public class Browser {

	// Acceptance Criteria
	// launch a browser
	// function name : launchBrowser(String browserName) : ch/ff/safari/edge
	// return : true/false : boolean
	// cc/ff/safari/edge: print a message and return true
	// ie: print an error message and return false

	public boolean launchBrowser(String browserName) {

		System.out.println("checking the browser..." + browserName);

		if (browserName.trim().equalsIgnoreCase("chrome")) {
			System.out.println("chrome is launched....");
			return true;
		}

		else if (browserName.trim().equalsIgnoreCase("firefox")) {
			System.out.println("firefox is launched....");
			return true;
		}

		else if (browserName.trim().equalsIgnoreCase("safari")) {
			System.out.println("safari is launched....");
			return true;
		}

		else if (browserName.trim().equalsIgnoreCase("edge")) {
			System.out.println("safari is launched....");
			return true;
		}

		else {
			System.out.println("Please pass the right browser.....");
			return false;
		}

	}

	public boolean initBrowser(String browserName) {
		System.out.println("checking the browser..." + browserName);

		boolean flag = true; // local variable in stack memory

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		default:
			System.out.println("browser is not found ..." + browserName);
			flag = false;
			break;
		}
		return flag;

	}

	
	
	public boolean initBrowser1(String brwName) {
		
		boolean flag = false;
		
		switch (brwName.trim().toLowerCase()) {
		case "chrome":
			return true;
		case "firefox":
			return true;
		case "ie":
			return true;
		default:
			System.out.println("browser is not found.." + brwName);
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {

		Browser br = new Browser();

		boolean flag = br.launchBrowser("CHROME");
		System.out.println(flag);

		if (flag) {
			System.out.println("enter the url");
		} else {
			System.out.println("browser is not found...no need to enter the url..");
		}

		boolean flagtrue = br.initBrowser("opera");
		System.out.println(flagtrue);

		if (flagtrue) {
			System.out.println("enter the url");
		} else {
			System.out.println("browser is not found...no need to enter the url..");
		}

		boolean fg=br.initBrowser1("chrome");
		System.out.println(fg);
		
		
	}

}
