//Constructor 

public class Constructor{
	
	int x; 


	public Constructor(int y){

		x = y; 

	}


	public static void main(String[] args){
		Constructor mycons = new Constructor(4555);
		
		System.out.println(mycons.x);
	}
}