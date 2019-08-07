abstract class Honda{          //----------abstract class---------------
	abstract void run();                   //----------abstract method---------------

}
public class Bike extends Honda {
	void run() {                         //-------------method declared----------------------
		System.out.println("speed");
	}
	
	

	public static void main(String[] args) {
		Honda ob=new Bike();                    //------------object created by using abstract class and main class----------
		ob.run();               //----------------method created---------------------

	}

}
