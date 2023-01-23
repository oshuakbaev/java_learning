public class Recursion{
	
	public static void main(String[] args){
		System.out.println(Sum(10));
	}

	static int Sum(int number){
		if(number>0){
			return number+Sum(number-1);
		}else{
			return 0; 
		}
	}
}