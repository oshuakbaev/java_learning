import java.util.Arrays;
import java.util.Scanner;

public class First{
    public static void selectionSort(char[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            char min = sortArr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            //меняем местами наименьший с sortArr[i]
            sortArr[i] = min;
        }
    }
    
    public static void main(String args[]) {

        Scanner myScanner = new Scanner(System.in); 

        char[] sortArr = new char[0]; // initialize an empty char array

        for(int i = 0; i < 3; i++) {
            System.out.print("Enter alphabet: ");
            char input_char = myScanner.next().charAt(0);

            sortArr = Arrays.copyOf(sortArr, sortArr.length + 1); // increase size of sortArr by 1
            sortArr[sortArr.length - 1] = input_char; // append input_char to the end of sortArr
        }

        
        // char[] sortArr = {'a','v','b','s','r','f','k','l','o'};
        selectionSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + " ");
        }
        
    }
}
