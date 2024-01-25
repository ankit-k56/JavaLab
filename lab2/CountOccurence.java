import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountOccurence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter a list of numbers separated by spaces: ");
        String inputNumbers = scanner.nextLine();

 
        String[] numbersArray = inputNumbers.split("\\s+");

   
        Map<Integer, Integer> occurrencesMap = new HashMap<>();


        for (String numStr : numbersArray) {
            int num = Integer.parseInt(numStr);
            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
        }

    
        for (Map.Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {
            System.out.println("Occurrence of " + entry.getKey() + "=" + entry.getValue());
        }
        scanner.close();
    }
}
