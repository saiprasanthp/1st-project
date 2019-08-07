class To{
	int a;
	To(int a){
		System.out.println("this is the first method");
		this.a=a;
		System.out.println(this.a);
		
		
	}
}
public class See extends To{
	int b;
	See(){
		super(10);
		
		System.out.println("this is the second method");
		this.b=20;
		System.out.println(this.b);
		
		
	}

	public static void main(String[] args) {
		See d=new See();
		
		

	}

}
