
public class Second {
	
	void pro1() {
		int a=10;
		 final int b=20;
		 
		 
		int sum=(a+b);
		int z=sum+1;
		System.out.println(z);
		
	}
	static void pro2() {
		
		System.out.println("hello2");
	}
	 void pro3() {
		double d=10.33;
		System.out.println(d);
	}
	void pro4() {
		System.out.println("jai");
	}
	

	public static void main(String[] args) {
		System.out.println("main method");
		Second obj =new Second();
		obj. pro1();

		Second obj1=new Second();
		Second. pro2();
		obj1.pro3();
		obj1.pro4();
		
		
		System.out.println("end process");
		
		
		

	}

}
