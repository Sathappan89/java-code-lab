package OOP_Abstract;
public class PageTest {
	public static void main(String[] args) {
		Login lp = new Login(10,20);
		// Parent class constructor will be called first
		// Child class constructor will called second
		lp.title();
		lp.url();
		lp.timeOut();
		lp.displayLogo();
		Page.displayFooter();// parent class can access static method
		Login.displayFooter();// child class can access static method
		lp.doLogin("admin", "admin123");

		System.out.println(" ");
		System.out.println("-------------------------");
		//
		CardPage cp = new CardPage();
		cp.title();
		cp.url();
		cp.timeOut();
		cp.displayLogo();
		cp.displayLogo();
		Page.displayFooter();

		System.out.println(" ");
		System.out.println("-------------------------");

		// Page pg=new Page(); Note Abstract class also we can't create the object same
		// like interface

		// top casting:
		// child class object can be referred by parent abstract class ref variable

		Page pg = new Login();
		pg.title();
		pg.url();
		pg.timeOut();
		pg.displayLogo();
		// pg.dologin(); //can't assess the child class individual method
		pg.inPage();

		// down casting: NA
	}
}