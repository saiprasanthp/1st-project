class Dog{
	int a;
	Dog(int a){
		System.out.println("THIS IS BASE CLASS");
		this.a=a;
		System.out.println(this.a);
		
	}
}
public class Cat extends Dog {
	int b;
	Cat(int a,int b){
		super(a);
		System.out.println("THIS IS DERIVED CLASS");
		this.b=b;
		System.out.println(this.b);
		
	}
	

	public static void main(String[] args) {
		Cat C=new Cat(30,40);
	}

}
