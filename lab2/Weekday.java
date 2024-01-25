import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number of the current month: ");
        int dayNumber = scanner.nextInt();
        scanner.close();
        //This is for the January of 2024
        int DayIndex = dayNumber  % 7;

    
        switch (DayIndex) {
            case 0:
                System.out.println("Weekday: Sunday");
                break;
            case 1:
                System.out.println("Weekday: Monday");
                break;
            case 2:
                System.out.println("Weekday: Tuesday");
                break;
            case 3:
                System.out.println("Weekday: Wednesday");
                break;
            case 4:
                System.out.println("Weekday: Thursday");
                break;
            case 5:
                System.out.println("Weekday: Friday");
                break;
            case 6:
                System.out.println("Weekday: Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
