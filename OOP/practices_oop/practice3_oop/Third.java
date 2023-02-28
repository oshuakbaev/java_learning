import java.util.Arrays;

public class Third {
    public static void main(String[] args) {
        String[][] arr = {
            {"apple", "orange", "banana"},
            {"car", "bus", "bike"},
            {"dog", "cat", "hamster"}
        };

        // Sort the 2D String array using insertion sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                String key = arr[i][j];
                int k = j - 1;
                while (k >= 0 && arr[i][k].compareTo(key) > 0) {
                    arr[i][k + 1] = arr[i][k];
                    k--;
                }
                arr[i][k + 1] = key;
            }
        }

        // Print the sorted array
        for (String[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
