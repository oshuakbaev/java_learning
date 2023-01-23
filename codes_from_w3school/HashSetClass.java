import java.util.HashSet; 


public class HashSetClass{

	public static void main(String[] args){

		HashSet<String> cars = new HashSet<String>();

		cars.add("BMW");
		cars.add("BMW");
		cars.add("BMW");

		cars.contains("Mazda");
		System.out.println(cars.contains("Mazda"));

	}
}