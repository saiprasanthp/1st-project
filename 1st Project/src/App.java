class Rep{
	Rep(){
		System.out.println("this is the BASE CLASS");
	}
	
}
class Dep extends Rep{
	Dep(){
		System.out.println("this is the INTERMEDIATE BASE CLASS");
	}
	
}
public class App extends Dep{
	App(){
		System.out.println("this is the DERIVED CLASS");
	}

}	
	
class Butter{
	public static void main(String[] args) {
		App a=new App();
		

	}

}
