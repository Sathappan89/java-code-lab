package OOP_Abstract;
public class Login extends Page{
	public Login() {
		System.out.println("Login page---constructor");
	}
	public Login(int i) {
		System.out.println("Login page---one param---constructor " + i ) ;
	}
	public Login(int i,int j) {
		System.out.println("Login page---two param---constructor " + i +" " + j ) ;
	}
	@Override
	public void title() {
		System.out.println("LP---title");
	}
	@Override
	public void url() {
		System.out.println("LP---URL");
	}
	@Override
	public void timeOut() {
		System.out.println("time out: 5 secs");
	}
	public void doLogin(String un,String pwd) {
		System.out.println("login to app:" + un + " : " + pwd);
	}
}