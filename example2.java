
public class Demo {

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Variables
        int num1 = 10;
        int num2 = 20;

        // Calling method
        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);

        // Conditional statement
        if (sum > 20) {
            System.out.println("Sum is greater than 20");
        } else {
            System.out.println("Sum is 20 or less");
        }

        // Loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
