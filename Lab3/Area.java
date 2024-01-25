import java.util.Scanner;
class Calc{
    double area(double a){
        // System.out.println("The area of circle is: "+(3.14*(a*a)));
        double area = (4*3.17*(a*a));
        return area;
    }
    int area(int a){
        // System.out.println("The area of square is: "+(a*a));
        return (a*a);
    }
    double area(int a, int b){
        // System.out.println("The area of triangle is : "+((1/2)*(a*b)));
        return ((a*b)/2);
    }
}

public class Area{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Finding area of CIRCLE ");
        System.out.println("Enter radius of circle in double: ");
        double num1 =  s.nextDouble();
        Calc ca = new Calc();
        System.out.println("Area of circle is: "+ ca.area(num1));

        System.out.println("Finding area of SQUARE ");
        System.out.println("Enter side of square in int: ");
        int num2 =  s.nextInt();
        Calc cs = new Calc();
        System.out.println("Area of square is: "+ ca.area(num2));


        System.out.println("Finding area of RECTANGLE ");
        System.out.println("Enter base of triangle in int: ");
        int num3 =  s.nextInt();
        System.out.println("Enter height of triangle in int: ");
        int num4 =  s.nextInt();
        Calc ct = new Calc();
        System.out.println("Area of rectangle is: "+ ca.area(num3, num4));
    }
    

}