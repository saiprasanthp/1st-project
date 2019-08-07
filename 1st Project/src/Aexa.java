abstract class First{
	abstract void smoke(int i,int j);
	abstract void kite(int x,int y);

	
	
}

public class Aexa extends First {
	int a;
	int b;
	 void smoke(int i,int j){
		 a=i;
		 b=j;
		 System.out.println(a);
		 System.out.println(b);
		 
		 
		
	}
	 void kite(int x,int y) {
		 a=x;
		 b=y;
		 System.out.println(a);
		 System.out.println(b);
		 
	 }

	public static void main(String[] args) {
		
	
		
		
		Aexa h=new Aexa();
		h.smoke(20,30);
		h.kite(40,50);
		
		

	}
	

}
