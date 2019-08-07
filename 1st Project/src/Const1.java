
public class Const1 {             //-------------main class name
	int a;                       //-----------instance variables-----------
	int b;
	int c;
	Const1(int x,int y){                           //-----parameterized constructor---------
		System.out.println("this is paramereterized constructor");
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
		System.out.println("this is the constructor");}
	
		void display(int f) {                   //------------method------------
			c=f;
			System.out.println("hello");
			
			
			
			
		}
		
	

	public static void main(String[] args) {
		Const1 co=new Const1(10,20);        //------------object creation------
		co.display(2);                      //------------method creation-------

	}

}
