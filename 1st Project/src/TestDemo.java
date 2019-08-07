class Leap{
	int a;
	int b;
	Leap(int i,int j){
		a=i;
		b=j;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("parameterized  constructor");
	}
	void display(int v) {
		a=v;
		System.out.println(a);
		System.out.println("hello");
		
	}
	
	
}
public class TestDemo {

	public static void main(String[] args) {
Leap t1=new Leap(20,30);
t1.display(20);


	}

}
