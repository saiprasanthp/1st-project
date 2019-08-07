class A{
	void method1() {
		System.out.println("this is the base class");
	}
	
}
class G extends A{
	void method2() {
		System.out.println("this is the child class");
	}
	
}
class C extends A{
	void method3() {
		System.out.println("this is the child2 class");
	}
	
}
public class HierachyExample {
	

	public static void main(String[] args) {
		A d1=new A();
		G d2=new G();
		C d3=new C();
		d1.method1();
		d2.method1();
		d3.method1();
	
		

	}

}
