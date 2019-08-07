public class Test{
	int a;
	int b;
	
	

	Test( ){
		this(10);
		
		
		
		System.out.println("this is one statements");
	}
	Test(int i){
		
		this(40,50);
	
		
		
		
		System.out.println("this is second");
		
	}
	
	Test(int k,int l){
		a=k;
		b=l;
		System.out.println("this is three statement");
	}
	
	
	
	

	public static void main(String[] args) {
Test obj1=new Test();
Test obj2=new Test(10);
Test obj3=new Test(40,50);
	}
}


