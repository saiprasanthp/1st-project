class Cf{
	int a;
	
	
	
	Cf() {
		

		
			
		
		
		System.out.println("jai");
	}
	
}
public class Df extends Cf {

	Df(int i) {
		super();
		a=i;
		System.out.println(a);
		
		
		System.out.println("hello");
	}
	void display(int i){
	a=i;
		System.out.println(a);
		System.out.println("this is the last one");
		
	}

	public static void main(String[] args) {
		Df ob1=new Df(5);
		ob1.display(6);
		
		

	}

}
