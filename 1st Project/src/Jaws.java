class Do{
	int x;
	int y;
	Do(){
		System.out.println("this should be the first");
	}
	void display() {
		System.out.println("hello first step");
	}
		
	}
	
	

public class Jaws extends Do {
	
	Jaws(int x,int y){
		super();
		this.x=x;
		this.y=y;
		System.out.println(this.x);
		System.out.println(this.y);
		
		
	}
	

	public static void main(String[] args) {
Jaws t=new Jaws(20,30);
t.display();




	}

}
