

public class StaticVsPublic{
	
	static void myStatic(){
		System.out.println("must be called without creating an objects");
	}

	public void myPublic(){
		System.out.println("must be called with objects");
	}

	public static void main(String[] args){
		// myStatic(); 
		// myStatic myStat = new myStatic();

		// myStat.myPublic();

		StaticVsPublic mypub = new StaticVsPublic();

		mypub.myPublic();




	}
}