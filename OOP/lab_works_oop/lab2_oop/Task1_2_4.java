import java.util.Scanner;

public class Task1_2_4{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        boolean flag = true; 
        int sum =0; 
        int cnt = 0; 
        while(flag){
            
            int userInput = myObj.nextInt(); 
            
            sum+= userInput; 
            cnt++; 
            if(userInput == 0){
                flag = false;
                cnt--; 
            }           
        }
        int middle = sum/cnt; 
        System.out.println("Sum is: "+sum); 
        System.out.println("Middle: "+middle); 
        
    }
}