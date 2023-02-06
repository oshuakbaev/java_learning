import java.util.Scanner; 


public class BonusTask3{
    
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Input your numbers:"); 
        
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        
        int sum = a+b+c;
        int multiply = a*b*c; 
        int difference = a-b-c; 
        
        System.out.println("Sum: "+sum+"\n");
        System.out.println("multiply:"+multiply+"\n");
        System.out.println("difference: "+difference+"\n");
    }
}