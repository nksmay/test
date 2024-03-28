package syumi;

public class Character implements Ningen{
	
	protected String name;
	
	public  Character(String name) {
		this.name = name;
	}
		
	public String getName () {
			return  name;
		}
	
	public void walk() {
		System.out.println(name + "は歩いた");
		}
	public void talk() {
		System.out.println(name + "は話した");
	}
}
	

