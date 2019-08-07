
public class Const2 {
	int a;
	int b;
	int c;
	double g;
	double h;
	int o;
	
	Const2(int v,int j){
		System.out.println("two parameters");
		a=v;
		b=j;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	Const2(int w,int e,int t){
		System.out.println("three parameters");
		a=w;
		b=e;
		c=t;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}

	
	Const2(double u,double p){
		System.out.println("this is float parameters");
		g=u;
		h=p;
		System.out.println(g);
		System.out.println(h);
		
	}
	Const2(int l,double k){
		System.out.println("this is int and double");
		a=l;
		h=k;
		System.out.println(a);
		System.out.println(h);
	}
	Const2(double o,int p){
		System.out.println("this is double and int");
		g=o;
		b=p;
		System.out.println(g);
		System.out.println(b);
	}
	void sum(int s) {
		o=s;
		System.out.println(o);
		System.out.println("hello");
	}
	Const2(Const2 T){
		a=T.a;
		h=T.h;
		System.out.println(a);
		System.out.println(h);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		Const2 t=new Const2(10,20);               //--------what we declare that only will print--
		t.sum(2);
		Const2 t1=new Const2(10,20,30);           //-----call by value-----------------
		Const2 t2=new Const2(10.5,20.5);
		Const2 t3=new Const2(10,20.5);
		Const2 t4=new Const2(10.5,20);
		Const2 t5=new Const2(t3);                //-------it means parameters are t3 and known as call by reference
		

	}

}
