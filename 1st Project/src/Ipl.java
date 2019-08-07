class Jump{
	int g;
	Jump(int g){
		this.g=g;
		System.out.println(this.g);
		System.out.println("this is the main method");
	}
	void test() {
		System.out.println("this is the test method");
		
	}
	
	}
	
public class Ipl extends Jump {
	int a;
	String name;
	float f;                                                          
	Ipl(int a,String name,float f){
		super(10);
		this.a=a;
		this.name=name;
		this.f=f;
		System.out.println(this.a+this.name+this.f);
	}
	void mass() {
		System.out.println("this is the super keyword");
	}
	
	public static void main(String[] args) {
		Ipl g=new Ipl(101,"sai",1200f);
		
		g.test();
		g.mass();

		
		
		
		
		
		
		
		
	}

}
