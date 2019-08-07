abstract class Bar{
	abstract void drink();
	void display() {
		System.out.println("hello");
	}
}
class Got extends Bar{
	void drink() {
		System.out.println("how many have u drink");
	}
	
}

public class TestAbstraction2 {

	public static void main(String[] args) {
		Bar b=new Got();
		b.drink();
		b.display();
		
		
		

	}

}
