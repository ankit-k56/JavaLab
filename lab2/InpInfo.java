import java.util.Scanner;
class InpInfo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Roll no.: ");
        int rollnumber = scanner.nextInt();
        System.out.print("Enter your section: ");
        int section = scanner.nextInt();
        System.out.print("Enter your branch: ");
        String branch = scanner.nextLine();
        scanner.close();


        System.out.println("Name: "+ name);
        System.out.println("Roll no.: "+ rollnumber);
        System.out.println("Section: "+ section);
        System.out.println("Branch "+ branch);

    }
}