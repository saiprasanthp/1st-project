class Was{
	int a;
	int b;

	Was(){
		System.out.println("this is default constructor");
	}
}
	

public class Ptsp extends Was {
	int a;
	int b;
	int z;
	void obj1() {
		System.out.println("this is null method");
	}
	void obj2(int x,int y) {
		super.a=x;
		super.b=y; 
		System.out.println(super.a);
		System.out.println(super.b);
		
		
		
	}
	void obj3(int t,int r,int i) {
		super.a=t;
	super.b=r;
		z=i;
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(z);
	}
	void display() {
		System.out.println("this is the example done with my own concept on super keyword");
	}

	public static void main(String[] args) {
		Ptsp t1=new Ptsp();
		t1.obj1();
		t1.obj2(10,20);
		t1.obj3(30,40,510);
		t1.display();
	    Was t2=new Was();

	}

}
