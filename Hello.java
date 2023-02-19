import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String myName = input.nextLine();
        System.out.println("Your Name is " + myName);
        
    }
}