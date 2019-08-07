
public class Tp5 {
	int a;
	Tp5(){
		System.out.println("hello1");
	}
	Tp5(int x){
		this();
		System.out.println("hello");
	a=x;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		Tp5 obj1=new Tp5(10);

	}

}
