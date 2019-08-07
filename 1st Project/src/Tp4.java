
public class Tp4 {
	Tp4(){
		this(10);
		System.out.println("hello");
	}
	Tp4(int x){
		this(20,30);
		System.out.println("hello 2");
	}
	Tp4(int a,int b){
		System.out.println("hello3");
		
	}
	

	public static void main(String[] args) {
Tp4 ob=new Tp4();
Tp4 ob1=new Tp4(10);
Tp4 ob2=new Tp4(20,30);

	}

}
