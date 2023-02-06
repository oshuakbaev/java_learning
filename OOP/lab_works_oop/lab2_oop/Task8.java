import java.util.Scanner;


public class Task8{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        double userInput = myObj.nextDouble();
        
        if(userInput == 0){
            System.out.println("zero\n");
        }else if(userInput == Math.abs(userInput)){
            System.out.println("Positive\n"); 
        }else if(userInput != Math.abs(userInput)){
            System.out.println("Negative\n"); 
        }
        
        if(userInput<1){
            System.out.println("small");
        }else if(userInput>1000000){
            System.out.println("Big"); 
        }
    }
}