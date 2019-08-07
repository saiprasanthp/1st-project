
public class Cons {
	int a;
	int b;
	int c;
	double f;
	double g;
	Cons(int x,int y){
		System.out.println("this is double parameterized constructor");
		a=x;
		b=y;
		System.out.println("the value of a"+"="+a);
		System.out.println("the value of b"+"="+b);
		
	}
	Cons(int s,int d,int r){
		System.out.println("this is three");
		a=s;
		b=d;
		c=r;
		System.out.println("the value of a"+"="+a);
		System.out.println("the value of b"+"="+b);
		System.out.println("the value of c"+"="+c);
		
	}
	Cons(double j,double h){
		System.out.println("this is floating point");
		f=j;
		g=h;
		System.out.println("the value of f"+"="+f);
		System.out.println("the value of g"+"="+g);
		
		
	}
	Cons(int l,double m){
		System.out.println("this is int and double");
		a=l;
		f=m;
		System.out.println("the value of a"+"="+a);
		System.out.println("the value of f"+"="+f);
	}
	Cons(double t,int p){
		System.out.println("this is double and int");
		f=t;
		a=p;
		System.out.println("thevalue of f"+"="+f);
		System.out.println("the value of a"+"="+a);
		
	}
	

	public static void main(String[] args) {
		Cons t1=new Cons(10,20);
		Cons t2=new Cons(10,20,30);
		Cons t3=new Cons(10.5,20.5);
		Cons t4=new Cons(10,20.5);
		Cons t5=new Cons(10.5,20);


	}

}
