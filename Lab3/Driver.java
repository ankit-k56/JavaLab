import java.util.Scanner;
class Substract{
    void sub(int a, int b){
        System.out.println("The difference of two numbers is: "+(a-b));
    }
    void sub(int a, int b, int c){
        System.out.println("The difference of three numbers is: "+(a-b-c));
    }
}

public class Driver{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Subtracting two numbers: ");
        System.out.println("Enter first number: ");
        int num1 =  s.nextInt();
        System.out.println("Enter second number: ");
        int num2 = s.nextInt();
        new Substract().sub(num1, num2);
        System.out.println("Subtracting three numbers: ");
        System.out.println("Enter first number: ");
        int num3 =  s.nextInt();
        System.out.println("Enter second number: ");
        int num4 = s.nextInt();
        System.out.println("Enter third number: ");
        int num5 = s.nextInt();
        new Substract().sub(num3, num4, num5);

    }
    

}