import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {43, 64, 228, 134};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the element to search:");
        int element = scanner.nextInt();

        int foundElement = 0;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
                foundElement = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element found in array in position " + (foundElement+1));
        } else {
            System.out.println("Element not found in array.");
        }
    }
}
