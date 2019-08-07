
public class Top {
	int a;
	int b;
	int c;

	
	
	
	
    Top(){
    	this(70,50);
    	System.out.println("this is the first type");
    	
    	
    	
    	
    }
    Top(int x,int y){
    	this(10,60,10);
    	System.out.println("this is the second type");
    	
    	
    }
    Top(int i,int h, int d){
    	a=i;
    	b=h;
    	c=d;
    	System.out.println("the value of a"+"="+a);
    	System.out.println("the value of b"+"="+b);
    	System.out.println("the value of c"+"="+c);

    	System.out.println("this is the third type");
    	
    	
    }
    void obj1(int i,int j,int l) {
    	
    	a=i;
    	b=j;
    	c=l;
    	System.out.println(a+b);
    	System.out.println(c);
    	
    	System.out.println("this is the empty method");
    }

	public static void main(String[] args) {
		Top d1=new Top();
		Top d2=new Top(70,50);
		Top d3=new Top(10,60,10);
		d3.obj1(30,47,69);

	}

}

