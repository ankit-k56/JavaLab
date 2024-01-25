import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;
        for(int i=1; i<=10;i++){
            System.out.println("Please enter number "+ i);
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}