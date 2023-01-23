import java.util.HashMap; 


public class HashMapClass{

    public static void main(String[] args){

        HashMap<String,String> myHash = new HashMap<String,String>(); 


        myHash.put("KZ", "ASTANA");
        myHash.put("USA", "WASHINGTON");
        myHash.put("CANADA", "OTAVA");
        
        // myHash.remove("KZ");
        // myHash.clear();
        // System.out.println(myHash.get("KZ"));       
        // System.out.println(myHash);

        for (String i : myHash.keySet() ) {
            System.out.println("keys: "+i+" "+"values: "+myHash.get(i));
        }
    }
}