public class Overloading{

	static int plusMethod(int x, int y){
		return x+y; 
	}
	static double plusMethod(double x, double y){
		return x+y; 
	}

	public static void main(String[] args) {

		
		System.out.println("int: "+plusMethod(5,7));

		System.out.println("double: "+plusMethod(5.5,7.7));
	}
}


// Overloading - это один метод и множество параметров! 