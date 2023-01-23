public class throwClass{
	
	static void checkAge(int age){

		if(age<18){

			throw new ArithmeticException("Access denied - you're not old enough");
		}else{
			System.out.println("Access granted!");
		}

	}

	public static void main(String[] args){

		checkAge(5);
	}
}