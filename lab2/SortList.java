import java.util.Arrays;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the list of numbers (separated by spaces): ");
        
    
        String[] inputNumbers = scanner.nextLine().split("\\s+");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

      
        Arrays.sort(numbers);

        scanner.close();

      
        System.out.print("Sorted Numbers (Ascending Order): ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
