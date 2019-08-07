
public class ExampleThis {
	
	int a;
	String name;
	float f;
	ExampleThis(int a,String name,float f){
		this.a=a;
		this.name=name;
		this.f=f;
		
	
	}
	void display() {
		System.out.println(this.a+this.name+this.f);
	}
	void main() {
		System.out.println("the main method");
	}
	

	public static void main(String[] args) {
		ExampleThis s1=new ExampleThis(101,"sai",2000f);
		s1.display();
		s1.main();
		
	}

}
