 q
public class CarModel{
	
	String CarName;
	int CarYear;


	public CarModel(String Name, int Year){

		CarYear = Year; 
		CarName = Name; 

	}

	public static void main(String[] args){

		CarModel myCar = new CarModel("Shevrolet Cobalt", 2022); 

		System.out.println("Car name:" + myCar.CarName);
		System.out.println("Car year:" + myCar.CarYear);
	}
}