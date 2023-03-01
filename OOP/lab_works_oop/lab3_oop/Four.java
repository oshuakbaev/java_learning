import java.util.*; 

public class Four{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5]; // change the array size to 4
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }

        Arrays.sort(arr);
        int median = (arr.length) / 2; // change the formula for median calculation
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); 
        }

        System.out.println(" ");
        if(arr.length % 2 == 0){
            System.out.println((arr[median-1] + arr[median])/2.0); // add decimal point to one of the numbers to force double division
        }else{
            System.out.println(arr[median]);
        }
        
    }
}
