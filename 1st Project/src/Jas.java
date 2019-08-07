class Dos{
	int a;
	int b;
	
void  help(int a,int g){
		this.a=a;
		b=g;
		System.out.println("this is the first parent class");
		System.out.println(this.a);
		System.out.println(b);	
		
	}
	
}
public class Jas extends Dos {
	int a;
	int b;
	void hope(int a,int b){
		super.help(10,50);
		System.out.println("this is the child class");
		
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}

	public static void main(String[] args) {
		Jas ad = new Jas();
		ad.hope(50,60);
		ad.help(10,50);
	}

}

