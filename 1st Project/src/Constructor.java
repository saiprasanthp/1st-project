
public class Constructor {
	int a;
	int b;
	Constructor(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
		
	}
	void m(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}

	public static void main(String[] args) {
		Constructor base=new Constructor(30,40);
		base.m(10,20);
		System.out.println("hello");

	}

}
