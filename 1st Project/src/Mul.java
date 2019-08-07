
public class Mul {
	int x;
	
	
	int b;
	void set(int y) {
		x=y;
		int i=0;
		for(i=0;i<=10;i++) {
			int res=x*i;

			
			System.out.println(x+"*"+i+"="+res);
		}
	}
	void table(int c ) {
		b=c;
		int i=0;
		for(i=0;i<=10;i++) {
			int res=b*i;
			System.out.println(b+"*"+i+"="+res+";");
		}
	}
	
	

	public static void main(String[] args) {
		Mul obj =new Mul();
		obj.set(4);
		obj.table(13);
		
		
	
		
		

	}

}
