
abstract class Sd {
	abstract void sum(int a,int b,int c);
	abstract void job(float t,float r,float d);
	void display() {
		System.out.println("print abstract");
	}
}

class Jd  extends  Sd{
	int a;
	int b;
	int c;
	float t;
	float r;
	float d;
	
	
	
	
	
	void sum(int a,int b,int c){
		
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(this.a);
		System.out.println(this .b);
		System.out.println(this.c);
		System.out.println("this is the sum method");
		
	}
	
		
		
	void job(float t,float r,float d){
		this.t=t;
		this.r=r;
		this.d=d;
		
		System.out.println(t);
		System.out.println(r);
		System.out.println(d);
		System.out.println("this is the second method");
	}
	
	

		
	

	public static void main(String[] args) {
		Sd h=new Jd();
		h.display();
		Jd n=new Jd();
		n.sum(10,20,30);
		n.job(266.09f,50.78f,89.57f);
		
		
		
		
	}
	 
		

	}


