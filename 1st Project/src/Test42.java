
public class Test42 {
	void getMethod() {
		System.out.println("hello7");
	}

	public static void main(String[] args) {
		Test42 t=new Test42();
		try {
			System.out.println(10/0);
		      t.getMethod();
			System.out.println("hello");
		}
		catch(Exception e) {
			
			System.out.println("hello2");
			
		}
		finally {
			System.out.println("hello3");
		}
		

	}

}
