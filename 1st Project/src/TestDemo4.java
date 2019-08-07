class Ad{
	
	int a;
	int b;
	int c;
	Ad(){
		System.out.println("default paramerters");
	}
	
}
class Bg{
	int a;int b;
	Bg(int i,int j){
		a=i;
		b=j;
		System.out.println(a);
		System.out.println(b);
		System.out.println("single parameterzed ");
		
	}
	
	
}
class Cs{
	int a;int b;int c;
	Cs(int s,int d,int f){
		a=s;
		b=d;
		c=f;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("3 parametresr");
	}
	
}
class D{
	int a;
	int b;
	D(int c,int v){
		a=c;
		b=v;
		System.out.println(a);
		System.out.println(b);
		System.out.println("2 parametesr");
	}
	
}
public class TestDemo4 {

	public static void main(String[] args) {
		Ad c=new Ad();
		Bg c1=new Bg(20,30);
		Cs c2=new Cs(40,50,40);
		D c3=new D(60,70);

	}

}
