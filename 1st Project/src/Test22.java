
public class Test22  {

	public static void main(String[] args) throws ArithmeticException {
		getStuff();

	}
	public static void getStuff() throws ArithmeticException{
		getMoreStuff();
		
	}
	public static void getMoreStuff() throws ArithmeticException{
		System.out.println(100/0);
	}
	

}
