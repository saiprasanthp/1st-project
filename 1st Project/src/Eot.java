
public class Eot {
	int a;
	int b;
	int s;
	void showdata(int a,int d){
		this.a=a;
		b=d;
		System.out.println(this.a);
		System.out.println(b);
		
		
	}
	void maindata(int b,int c) {
		
		this.b=b;
		s=c;
		System.out.println(this.b);
		System.out.println(s);
		
		
		System.out.println("hello world");
	}
	void display() {
		System.out.println("this is the example of this keyword");
	}

	public static void main(String[] args) {
		Eot t1 = new Eot();
		t1.showdata(3,4);
	
		t1.maindata(7,9);
		t1.display();

	}

}
