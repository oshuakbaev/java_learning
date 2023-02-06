import java.util.Scanner; 
import java.util.ArrayList; 

public class Task1_2_6{
    
    static int isMax(ArrayList<Integer> myArray){
        
        int max = myArray.get(0); 
        
        for(int i=0;i<myArray.size();i++){
        
            if(max<myArray.get(i)){
                max = myArray.get(i);
            }
        }
        return max; 
    }
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter your numbers:"); 
        
        boolean flag = true; 
        int max = 0; 
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        
        while(flag){
            
            int userInput = myObj.nextInt();
            myArray.add(userInput); 
            
            if(userInput == 0){
                flag = false; 
            }    
        }
        
        System.out.println("Your maximum is: "+isMax(myArray)); 
        
    }
}