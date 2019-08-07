
public class Test24 {
	
	void getMethod() {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(20/2);
			
		}
	}
	static  Exception e;
	void getMethod2() {
		try{
			throw e;
			
		}
		catch(Exception e) {
			System.out.println("tel");
			
			
		}
	}

	public static void main(String[] args)  {
		Test24 t=new Test24();
		
try {
	t.getMethod();
	t.getMethod2();
	System.out.println("hello");
	
	
}
catch(Exception e) {
	System.out.println("hello2");
	
}finally {
	System.out.println("hiii");
}
 String s=null;

	try {
		System.out.println(s.length());
	}
	catch(NullPointerException e) {
		System.out.println("null");
	}
		
	}

}
