import java.util.Scanner; 


class BonusTask1{
    
    // String myCountry(String myInputCountry){
        
    // }    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("First name-> ");
        String first_name = myObj.nextLine();
        
        
        
        System.out.print("Last name-> ");
        String last_name = myObj.nextLine();
        
        
        
        System.out.print("age-> ");
        int myAge = myObj.nextInt();
        
          
        System.out.print("Country-> ");
        String myCountry = myObj.nextString();
        
        
        System.out.println("First name-> "+first_name);
        
        System.out.println("Last name-> "+last_name);
        
        System.out.println("Age-> "+myAge);
        
        System.out.println("Country-> "+myCountry); 
           
        
        
        
    }
}
