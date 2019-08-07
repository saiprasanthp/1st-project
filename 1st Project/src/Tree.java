abstract class Ground{
	abstract void ground();
	abstract void food();
	abstract void water();
	void display() {
		System.out.println("this is the tree");
	}
}
public class Tree extends Ground {
	void ground() {
		System.out.println("this is water");
	}
	void food() {
		System.out.println("this is fruits");
	}
	void water() {
		System.out.println("this is money");
	}

	public static void main(String[] args) {
		Ground r=new Tree();
		r.display();
		Tree e=new Tree();
		e.ground();
		e.food();
		e.water();   //---------------------this is abstract class example-----------------------------------
		

	}

}
