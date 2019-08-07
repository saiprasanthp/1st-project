class Inh2{
	int a;
	int b;
	int c;
	void display() {
		System.out.println("hello1");
		
	}
	void disp() {
		System.out.println("hello");
		
	}
	
}
public class Inh1 extends Inh2{
void air(int a,int b,int c) {
	super.a=a;
	super.b=b;
	super.c=c;
	System.out.println(super.a);
	System.out.println(super.b);
	System.out.println(super.c);
		
	}
	void display() {
		super.display();
		System.out.println("super keyword");
		
		
	}
	void disp() {
		super.disp();
		System.out.println("super and  keyword");
		
	}
	

	public static void main(String[] args) {
		Inh1 obj=new Inh1();
		obj.air(20, 40, 50);
		obj.display();
		obj.disp();
		
		

	}

}
