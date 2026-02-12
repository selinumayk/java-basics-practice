package arrays;

public class AverageCalculator {

    public static void main(String[] args) {

        int[] numbers = {70, 85, 90, 60, 75};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);
    }
}

