
public class Eoo {
	int a;//-----------------------instance variable-------
	int b;
	void mainspeed(int a,int b) {//---------local variables-----
		this.a=a;                  //compiler think that this is repaced by obj.a,obj.b....hence right is local variable and right is instance variable
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}

	public static void main(String[] args) {
Eoo obj=new Eoo();
obj.mainspeed(10,20);
	}

}
