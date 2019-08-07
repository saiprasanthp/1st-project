
public class Para {
	int a;int b;
	Para(int x,int y){
		this(1000);
		System.out.println("the is double perameterized constructor");
		a=x;
		b=y;
		System.out.println("the value of a"+"="+a);
		System.out.println("the value of b"+"="+b);
	}
	Para(){
		
		System.out.println("this is  perameterized constructor");
		int a=0;
		int b=0;
		System.out.println("the value of a"+"="+a);
		System.out.println("the value of b"+"="+b);

		
	}
	Para (int x){
		System.out.println("this is single perameterized constructor");
		a=x;
		b=x;
		System.out.println("the value of a"+"="+a);
		System.out.println("the value of b"+"="+b);
	}
	Para(Para T){
		System.out.println("this is perameterized constructor");
		a=T.a;//--------------------------------------------------based on test1-------
		b=T.b;
		System.out.println("the value of a"+"="+a);
		System.out.println("the value of b"+"="+b);
		
		
	}
	

	public static void main(String[] args) {
		Para test1=new Para(10,20);
		Para test2=new Para();
		Para test3=new Para(1000);
		Para test4=new Para(test1);

		

	}

}
