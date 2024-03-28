package syumi;

public class Person extends Character{
	
	public Person (String name) {
		super(name);	
	}
	
	private String mecha;
	

	public void setMecha(String mecha) {
		this.mecha = mecha;
	}
	

	public String getMecha() {
		return  mecha;
	}
	
	public void ride() {
		System.out.println(name + "は" + mecha + "に乗った！");
	}
}
