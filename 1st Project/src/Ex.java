class Rt{
	int a;int b;int c;
}
public class Ex extends Rt {
	void hungry(int a,int b,int c) {
		this.a=a;
		this.b=b;
		super.c=c;
		System.out.println(this.a);
		System.out.println(super.c);
	}
	
	

	public static void main(String[] args) {
		Ex n=new Ex();
		n.hungry(20,30,50);

	}

}
