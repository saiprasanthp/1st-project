
public class Example {
	Example(){
		this(100,200);
		System.out.println("this is the  default construcor");
	}
	Example(int i){
		this();
		System.out.println("this is first constructor");
	}
	Example(int x,int y){
		System.out.println("this is the last constructor");
	}

	public static void main(String[] args) {
		Example obj1=new Example();
		Example obj2=new Example(100);
		Example obj3=new Example(100,200);

	}

}
