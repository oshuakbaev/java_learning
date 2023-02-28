import java.util.Arrays;
import java.util.Scanner;

public class Second {
    
    public static void insertionSort(char[] sortArr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            char swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
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


        insertionSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + " ");
        }
    }
}
