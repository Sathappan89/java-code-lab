package OOP_Abstract;
public class CardPage extends Page{
	@Override
	public void title() {
		System.out.println("CP --- title");
	}
	@Override
	public void url() {
		System.out.println("CP --- URL");	
	}
	@Override
	public void timeOut() {
		System.out.println("time out: 15 secs");
	}
}