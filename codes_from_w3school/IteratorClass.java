import java.util.Iterator; 
import java.util.ArrayList; 
import java.util.Scanner; 

public class IteratorClass{

  public static void main(String[] args){

    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    

    System.out.println("Input your values: "); 

    for(int i = 0; i< 3; i++){
      Scanner inputValue = new Scanner(System.in); 

      int ReadValue = inputValue.nextInt();
      numbers.add(ReadValue); 

    }


    Iterator<Integer> it = numbers.iterator();

    while(it.hasNext()){
      System.out.println(it.next());
    }
    
    System.out.println(it.hasNext());



  }
}