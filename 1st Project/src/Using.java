class Gas{
	int a;
	Gas(int a){
		System.out.println("this is paramertized constructor");
		this.a=a;
		System.out.println("the value of a"+"="+this.a);
		
	}
}
public class Using extends Gas {
	int b;
	
	Using(){
		super(20);
		System.out.println("this is main constructor");
		this.b=30;//---------------------we can also assign there means the values-------
		System.out.println("the value of b"+"="+this.b);
		
		
		
		System.out.println("sai");
		
	}

	public static void main(String[] args) {
		Using job=new Using();
		
	}

}
