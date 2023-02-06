import java.util.Scanner; 


public class Task10{  
    
    public static void main(String args[]){  
      
      Scanner myObj = new Scanner(System.in); 
      System.out.println("Enter numbers between 1 and 26: "); 
      int userInput = myObj.nextInt();
      char userInputChar=' ';
       
      if(userInput<1 && userInput>26){
          System.out.println("Error");
      }
      else{
          userInput+=64; 
          
          userInputChar = (char)userInput;
          
       }
      
      System.out.println(userInputChar); 
    }
    
}