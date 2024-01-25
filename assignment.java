import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Enter student name: ");
        String name = reader.readLine();     
        System.out.print("Enter student roll number: ");
        int rollNumber = Integer.parseInt(reader.readLine());  
        System.out.print("Enter Branch: ");
        String branch = reader.readLine();
        System.out.print("Enter Section: ");
        int section = Integer.parseInt(reader.readLine());
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
        reader.close();
    }
}
