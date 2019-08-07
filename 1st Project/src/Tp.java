
public class Tp {
	int a;
	String name;
	float f;
	Tp(int a,String name,float f){
		this.a=a;
		this.name=name;
		this.f=f;	
	}
	void display() {
		System.out.println(this.a+this.name+this.f);
	}

	public static void main(String[] args) {
		Tp t1=new Tp(101,"sai",1000f);
		Tp t2=new Tp(102,"manu",1800f);
		t1.display();
		t2.display();

	}

}
