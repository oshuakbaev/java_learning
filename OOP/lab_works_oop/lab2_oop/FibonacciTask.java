import java.util.Scanner; 


public class FibonacciTask{
    
    static int Fibonacchi(int n){
        
        if(n <= 1){
            return n; 
        }
        return Fibonacchi(n-1)+Fibonacchi(n-2);
    }
    public static void main(String[] args ){
        
        Scanner myObj = new Scanner(System.in); 
        
        int userInput = myObj.nextInt(); 
        
        System.out.println(Fibonacchi(userInput));    
        
    }
}