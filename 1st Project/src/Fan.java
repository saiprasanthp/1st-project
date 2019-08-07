class Tdp{
	Tdp(){
		System.out.println("this is the default constructor");
	}
	void display() {
		System.out.println("the example of this");
	}
	
	
}
public class Fan extends Tdp {
	int a;
	Fan(int a){
		super();             //------------optional------------------
		this.a=a;
		System.out.println(this.a);
		System.out.println("this is single derived parameterized constructor");
		
	}
	
	

	public static void main(String[] args) {
		Fan od=new Fan(20);
		od.display();

	}

}
