import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        this.length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        this.breadth = scanner.nextInt();

        scanner.close();
    }


    public int calculateArea() {
        return length * breadth;
    }
    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }
    public void display() {
        System.out.println("Area of the rectangle: " + calculateArea());
        System.out.println("Perimeter of the rectangle: " + calculatePerimeter());
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle(0, 0);

        myRectangle.read();

        myRectangle.display();
    }
}