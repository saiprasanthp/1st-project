
public class Tp1 {

	void m() {
		System.out.println("this is this keyword");
	}
	void v() {
		
		System.out.println("this is next");
		this.m();                              //----------this keyword another method
	}
	public static void main(String[] args) {
Tp1 t1=new Tp1();
t1.v();
	}

}
