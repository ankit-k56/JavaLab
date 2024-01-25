import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        int largestNumber = num1;

        if (num2 > largestNumber) {
            largestNumber = num2;
        }

        if (num3 > largestNumber) {
            largestNumber = num3;
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}