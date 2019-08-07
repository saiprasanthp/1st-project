
public class Tp6 {
	void m(Tp6 T) {          //constructor name and some object
		System.out.println("passing argument");
	}
	void n() {
		m(this);
		System.out.println("passing argument2");
	}

	public static void main(String[] args) {
		Tp6 obj =new Tp6();
		obj.n();

	}

}
