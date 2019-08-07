class Cd{
	int a;
	int b;
	
	
}
public class Bc extends Cd {
	void sai(int x,int y) {
		 a=x;
		 b=y;
		
		
		
		System.out.println(a);
		System.out.println(b);
	}


	
	void sum(int h,int j) {
		 a=h;
		 b=j;
		System.out.println(a);
System.out.println(b);		
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
 Bc od1=new Bc();
 od1.sai(2,3);
 od1.sum(5,8);
 

	}

}
