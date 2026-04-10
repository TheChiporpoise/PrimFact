public class conditionals {
    public static void main(String[] args) {
        int x = 10; // declare data type of variable and assign value

        // greater than comparison
        if (x > 5) {
            System.out.println("x is greater than 5\n");
        } else {
            System.out.println("x is not greater than 5\n");
        }
        
        // equality comparison
        if (x == 3) {
            System.out.println("x is equal to 3\n");
        } else {
            System.out.println("x is not equal to 3\n");
        }

        // modulo logic to checck if x is even or odd
        if (x % 2 == 0) {
            System.out.println("x is even\n");
        } else {
            System.out.println("x is odd\n");
        }

        // modulo logic combined with logical AND to check if x is divisible by both 2 and 3
        if (x % 2 == 0 && x % 3 == 0) {
            System.out.println("x is divisible by both 2 and 3\n");
        } else {
            System.out.println("x is not divisible by both 2 and 3\n");
        }

        // logical OR to check if x is divisible by either 2 or 3
        if (x % 2 == 0 || x % 3 == 0) {
            System.out.println("x is divisible by either 2 or 3\n");
        } else {
            System.out.println("x is not divisible by either 2 or 3\n");
        }
    }
}
