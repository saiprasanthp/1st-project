class Mog{
	void crowing() {
		System.out.println("knowing");
	}
	
}
class Kog extends Mog{
	void baking() {
		System.out.println("talking");
	}
	
}
public class Multi extends Kog {
	void barking() {
		System.out.println("baking");
	}

	public static void main(String[] args) {
Multi h=new Multi();
h.barking();
h.crowing();
h.baking();
	}

}
