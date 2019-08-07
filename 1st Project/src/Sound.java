abstract class Spark{
	abstract void free();
	abstract void rest();
		void display() {
			System.out.println("this is abstract class");
		}
	}

public class Sound extends Spark {
	void free() {
		System.out.println("this is the main class");
	}
	void rest() {
		System.out.println("the second one");
	}

	public static void main(String[] args) {
		Sound so=new Sound ();
		
		so.free();
		
		
		so.rest();
		Spark d =new Sound();     //object create will not done in abstract class
		d.display();              //so we should do like this
		

	}

}
