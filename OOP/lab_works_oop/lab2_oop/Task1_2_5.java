import java.util.Scanner; 

public class Task1_2_5{
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter n: "); 
        
        int n = myObj.nextInt();
        for(int i = 0; i<n; i++){
            System.out.print((int)Math.pow(i,2)+" "); 
        }
    }
}