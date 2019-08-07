
public class Tp2 {
	Tp2(){
		System.out.println("hello");
	}
	
	Tp2(int a,int b){
		this();
		
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
Tp2 t1=new Tp2(2,4);

	}

}
