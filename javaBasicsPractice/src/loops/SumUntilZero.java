package loops;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Enter numbers (0 to stop):");

        number = input.nextInt();

        while (number != 0) {
            sum += number;
            number = input.nextInt();
        }

        System.out.println("Total sum: " + sum);

        input.close();
    }
}
