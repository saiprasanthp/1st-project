
public class Mthod {
	void n(int i,int g,int h) {
		i=10;
		g=20;
		h=30;
		System.out.println(i);
		System.out.println(g);
		System.out.println(h);
		System.out.println("hello");
	}
	void m() {
		this.n(10,20,30);
		System.out.println("hai");
		
		
		
	}

	public static void main(String[] args) {
		Mthod r=new Mthod();
		r.m();

	}

}
