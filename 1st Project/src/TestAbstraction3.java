abstract class Pol{
	Pol(){
		System.out.println("hello");
	}
	abstract void sum();
	
}
class Joo extends Pol{
	void sum() {                          //----------------abstract class example------------------
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
}
class Roo extends Pol{
	void sum() {
		float f1=20000f;
		float f2=40000f;
		float sum=f1+f2;
		System.out.println(sum);
	}
}
public class TestAbstraction3 {

	public static void main(String[] args) {                ///------------abstract class example----------
		Pol d=new Joo();
		d.sum();
		Pol d1=new Roo();
		d1.sum();
		

	}

}
