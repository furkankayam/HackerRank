import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        double b = scanner.nextDouble();

        scanner.nextLine();

        String c = scanner.nextLine();


        //OUTPUT
        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);

    }
}