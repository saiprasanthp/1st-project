class Cb{
	int a;
	Cb(int a){
		System.out.println("this is the first");
		this.a=a;
		System.out.println(this.a);
		}
		
}
class Sa extends Cb{
	
	int b;
	Sa(int a,int b){
		super(30);
		a=20;
		System.out.println(a);
		System.out.println("second one");
		this.b=b;
		System.out.println(this.b);
	}
}
class Fd extends Sa{
	int c;
	Fd(int c){
		super(20,50);
		System.out.println("this is third ");
		this.c=c;
		System.out.println(this.c);
		
	}
	
	}
public class An extends Fd{
	int d;
	An(int d){
		super(80);
		System.out.println("this is fourth one");
		this.d=20;
		System.out.println(this.d);
	}

	public static void main(String[] args) {
		An go=new An(20);

	}

}
