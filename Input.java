import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.printf("%s , Welcome to the world of java \n",name);

        int a = 5, b = 10;
        int sum = a+b;
        System.out.printf("the number is %d \n",  sum);
    }
}