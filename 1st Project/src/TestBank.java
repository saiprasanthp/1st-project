abstract class Bank{
	abstract int a();
}
	
class Tom extends Bank{
	int a() {
		return 7;
	}
}
	

class Ask extends Bank{
	int a() {
		return 8;
	}
	
}
public class TestBank {

	public static void main(String[] args) {
		Bank b;
		b=new Ask();
		System.out.println();
		

	}
}
