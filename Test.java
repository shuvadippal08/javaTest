public class Test {

    private static final int MAX = 1000000;
    private static boolean[] isPrime;

    // Static block runs once when class is loaded
    static {
        isPrime = new boolean[MAX + 1];
        // Initialize all numbers as prime
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int p = 2; p * p <= MAX; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= MAX; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
    }

     public static int countPrimesInRange(int L, int R) {
        int count = 0;
        if (L < 2) {
            L = 2; // primes start from 2

        }
        for (int i = L; i <= R && i <= MAX; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
    
    // Addition
    static void add(int a, int b) {
        int res = a + b;
        System.out.println("Addition result: " + res);
    }

    // Subtraction
    static void sub(int a, int b) {
        int res = a - b;
        System.out.println("Subtraction result: " + res);
    }

    // Multiplication
    static void mul(int a, int b) {
        int res = a * b;
        System.out.println("Multiplication result: " + res);
    }

    // Division
    static void div(int a, int b) {
        if (b != 0) {
            double res = (double) a / b;
            System.out.println("Division result: " + res);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    static void rem(int a , int b){
        if(b != 0){
            System.out.println("Reminder is "+(a%b));
        }else{
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Main method
    public static void main(String[] args) {
        int x = 108905;
        int y = 10;

        add(x, y);
        sub(x, y);
        mul(x, y);
        div(x, y);
        rem(x,y);
        System.out.println("Number of primes between " + x + " and " + y + " = " + countPrimesInRange(y, x));
    }
}


