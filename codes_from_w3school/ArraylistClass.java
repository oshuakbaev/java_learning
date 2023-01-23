import java.util.ArrayList;

public class ArraylistClass{
	
	public static void main(String[] args){

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Volvo");
		cars.add("Avtovaz");
		cars.add("bmw");
		cars.add("mers");

		// System.out.println(cars);
		// System.out.println(cars.get(0));

		cars.set(0,"Opel");


		cars.remove(0);
		System.out.println(cars.get(0));
		
	}
}