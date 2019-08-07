abstract class Pog{
	abstract void bark();
	
}
class Af extends Pog{
	void bark() {
		System.out.println("lying");
	}
	
}
class Bf extends Pog{                               //------------our wish to create class but extends should be abstract class
	void bark() {
		System.out.println("barking");
	}
	
}
public class TestAbstraction1 {                        //-------------main class--------------------

	public static void main(String[] args) {
		Pog t1=new Bf();                               //obj created-------------
		t1.bark();                                      //--------------method-----------
		Pog t2=new Af();
		t2.bark();                                      //abstract class name obj =new class name we want we can write-------------
		

		
	}

}
