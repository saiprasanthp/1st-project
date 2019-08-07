
public class Tp8 {
	Tp8 getA() {
		return this;
	}
	void m() {
		System.out.println("return this ");
	}
	

	public static void main(String[] args) {
new Tp8().getA().m();                   //---class name--method
	}

}
