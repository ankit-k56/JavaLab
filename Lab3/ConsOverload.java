import java.util.Scanner;

class Rectangle {

    int length;
    int breadth;


    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }
}

public class ConsOverload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Rectangle rectangle1 = new Rectangle();

        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        Rectangle rectangle2 = new Rectangle(length, breadth);

        System.out.println("\nArea of rectangle with default values: " + rectangle1.calculateArea());
        System.out.println("Area of rectangle with user-input values: " + rectangle2.calculateArea());
    }
}
