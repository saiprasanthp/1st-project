class Crow{
	void nav2() {
		System.out.println("nav2");
	}
	
}

class Gap extends Crow{
	void nav3() {
		System.out.println("nav3");
	}
}
public class Herachy extends Crow{
	void nav1() {
		System.out.println("nav1");
	}

	public static void main(String[] args) {
		Herachy k=new Herachy();
		k.nav1();
		k.nav2();
		
	}
}
