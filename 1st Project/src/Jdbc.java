class Hasp{
	int a;
	int b;
	int t;
	void display() {
		System.out.println("this is the first one");
	}
	
	
	
}
public class Jdbc extends Hasp{

	void rept(int a,int b) {
		super.a=a;
		super.b=b;
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println("this is first method");
	}
	void test(int x,int y,int z) {
		a=x;
		b=y;
		t=z;
		System.out.println(a);
		System.out.println(b);
		System.out.println(t);
		System.out.println("this is the second  method");
		
		
	}
	
	
	
	public static void main(String args[]) {
		Jdbc obj1=new Jdbc();
		obj1.display();
		obj1.rept(2,3);
		Jdbc obj2=new Jdbc();
		obj2.test(10,20,30);
		
		
	}

}
