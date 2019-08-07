class Hog{
	void bite() {
		System.out.println("barking");
	}
}
public class Single extends Hog {
	void crow() {
		System.out.println("crowing");
	}

	public static void main(String[] args) {
		Single g=new Single();
		g.crow();
		g.bite();

	}

}
