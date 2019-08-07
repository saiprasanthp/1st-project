abstract class At{                      //------abstract class-----------
	abstract void sup(int i,int j);     //=====abstract method===
	void display() {
		System.out.println("this is the first ");
	}
	
	
}
public class Digits extends At{    //-----------main class ------------
	int a;
	int b;
	void sup(int i,int j ) { 
                                                  //====should declare here=====
		a=i;
	    b=j;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	

	public static void main(String[] args) {
		Digits b=new Digits();       //====object creation====
		b.sup(20,30);
		At f=new Digits();          //====abstract object creation/////abstract class name= main  class name
		f.display();            //=======this is the abstract class======
		
		

	}

}
