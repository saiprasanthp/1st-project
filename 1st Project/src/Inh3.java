class Inh4{
	void display() {
		System.out.println("barking");
	}
}
public class Inh3 extends Inh4 {
	void dog() {
		super.display();
		System.out.println("creaming");
	}
	
	public static void main(String[] args) {
		Inh3 d=new Inh3();
		d.dog();
		

	}

}
