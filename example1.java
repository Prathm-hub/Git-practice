
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Displaying the input
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
