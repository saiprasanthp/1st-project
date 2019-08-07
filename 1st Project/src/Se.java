class De{
	void sep1() {
		
		System.out.println("hello world");
	}
	
}
public class Se extends De {
	int a;
	int b;
	
	void sew1(int i,int j) {
		
		super.sep1();
		a=i;
		b=j;
		System.out.println(a);
		System.out.println(b);
		System.out.println("second statement");
		
	}

	public static void main(String[] args) {
		Se obj=new Se();
		obj.sep1();
		obj.sew1(20,30);

	}

}
