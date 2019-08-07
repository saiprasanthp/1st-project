class Task{
	 float salary=2000;
	
	
}
public class Isa extends Task {
	int bonus=20000;
	

	public static void main(String[] args) {
		Isa d=new Isa();
		System.out.println(d.salary);
		System.out.println(d.bonus);

	}

}
