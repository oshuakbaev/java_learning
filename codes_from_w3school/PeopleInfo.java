import java.util.HashMap;

public class PeopleInfo{
	
	public static void main(String[] args){

		HashMap<String,Integer> humans = new HashMap<String,Integer>();

		humans.put("Saltanat",41); 
		humans.put("Darhan",65); 
		humans.put("Ata",70); 
		humans.put("Azhe",67); 

		System.out.println(humans);
	}
}