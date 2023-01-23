// Polymorphysm 
public class Polymorphysm{
	
	public static void main(String[] args){

		Animal myAnimal = new Animal();
		Animal myCat = new Cat(); 
		Animal myDog = new Dog(); 

		myAnimal.AnimalSound();
		myCat.AnimalSound();
		myDog.AnimalSound();
	}


}


