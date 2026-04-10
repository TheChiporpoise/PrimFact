import java.util.ArrayList;
import java.util.Scanner;

public class primFact {
    public static void main(String[] args) {
        String input = " ";
        String output = "";

        while (true) {
            System.out.print("Enter a number to factor (or press Enter to exit): ");
            input = new Scanner(System.in).nextLine(); // Read user input

            if (input.isEmpty()) {
                break; // Exit the loop if the user presses Enter without typing anything
            }

            try {
                int num = Integer.parseInt(input);

                if (num <= 0) {
                    throw new NumberFormatException();
                }

                // int[] factors = primeFactorization(num);
                ArrayList<Integer> factors = primeFactorization(num);

                if (input.equals("1")) {
                    output = "1 isn't Prime or Composite dummy.\n";
                // } else if (factors.length == 1) {
                } else if (factors.size() == 1) {
                    output = "The number " + input + " is Prime.\n";
                } else {
                    // output = "The Prime factors of " + num + " are: " + java.util.Arrays.toString(factors) + "\n";
                    output = "The Prime factors of " + num + " are: " + factors + "\n";
                }

                System.out.println(output);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.\n");
            }
        }

        System.out.println("Exiting program. Goodbye!");
    }

    // public static int[] primeFactorization(int num) {
    public static ArrayList<Integer> primeFactorization(int num) {
        // int[] factors = new int[100];
        // int index = 0;
        ArrayList<Integer> factors = new ArrayList<>();

        // Divides by 2 until it's odd
        while (num % 2 == 0) {
            // factors[index++] = 2;
            factors.add(2);
            num /= 2;
        }

        // Divides by odd numbers starting from 3 until the square root of num (f * f <= num is more efficient than f <= sqrt(num))
        int f = 3;
        while (f * f <= num) {
            while (num % f == 0) {
                // factors[index++] = f;
                factors.add(f);
                num /= f;
            }
            f += 2;
        }

        if (num != 1) {
            // factors[index++] = num;
            factors.add(num);
        }

        // return java.util.Arrays.copyOf(factors, index);
        return factors;
    }
}