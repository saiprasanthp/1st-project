class Dsp{
	int a;
	
}
public class Asp extends Dsp {
	int a;
	
	void sp1(int x,int y ) {
		super.a=x;
		a=y;
		System.out.println(y);
		System.out.println(super.a);
		
		
		
	}
	void sum() {
		a=(super.a)+a;
		
		
		System.out.println("sum"+"="+a);
	}

	public static void main(String[] args) {
		Asp id=new Asp();
		id.sp1(1,2);
		id.sum();
		
;
		
	}

}
