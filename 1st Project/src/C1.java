class C2{
	int a;
	int f;
	
	C2(){
	
		
		System.out.println("this is the first language");
		
	}
	void show(int a,int c) {
		this.a=a;
		f=c;
		System.out.println(this.a);
		System.out.println(f);
		
	}
}
public class C1 extends C2{
	int x;

	
	 C1(int a,int b) {
		 super.show(10,20);
		 super.a=a;
		 System.out.println(super.a);
		 System.out.println("this is the main one");
		 x=b;
		 System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		
		C1 ap = new C1(10,20);
		ap.show(10,20);
		

	}

}
