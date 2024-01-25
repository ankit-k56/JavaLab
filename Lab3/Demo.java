import java.util.Scanner;


class Box {

    private int length;
    private int width;
    private int height;


    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public int volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the length of the box: ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the box: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the box: ");
        int height = scanner.nextInt();


        Box myBox = new Box(length, width, height);


        System.out.println("Volume of the box: " + myBox.volume());

        scanner.close();
    }
}