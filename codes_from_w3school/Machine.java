//Machine 

public class Machine{
	
	public void fullThroat(){
		System.out.println("Car is going to be faster"); 
	}

	public void Speed(int speed){
		System.out.println("Speed: "+speed); 
	}


	public static void main(String[] args){
		Machine myCar = new Machine(); 

		myCar.fullThroat(); 
		myCar.Speed(200); 
	}
}

// by object you can access to ATTRIBUTES and to the METHODS 

