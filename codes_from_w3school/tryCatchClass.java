public class tryCatchClass{
	
	public static void main(String[] args){

		try{
			int[] numbers = {1,5,6}; 

			System.out.println(numbers[10]);
		}catch(Exception e){
			System.out.println("Something went wrong");
		}finally{
			System.out.println("the try cath have finished");
		}
	}
}