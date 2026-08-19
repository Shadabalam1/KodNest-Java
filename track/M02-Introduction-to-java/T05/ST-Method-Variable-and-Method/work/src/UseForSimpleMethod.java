import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return 7
        return 7;
    }

    int add(int first, int second) {
        // Return the sum
        return first + second;
    }
}

public class UseForSimpleMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the name and two numbers
        // Create one object
        // Call all four methods
        String name = scanner.nextLine();
        // scanner.nextLine();

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        MethodDemo demo = new MethodDemo();

        demo.sayHello();
        demo.greet(name);
        System.out.println("Lucky Number: " + demo.getLuckyNumber());
        System.out.println("Sum: " + demo.add(first, second));
    }
}