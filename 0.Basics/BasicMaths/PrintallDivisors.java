package BasicMaths;

public class PrintallDivisors {
    // Brute Force Approach
    static void divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + "");
            }
        }
    }

    public static void main(String args[]) {
        int n = 36;
        divisors(n);
    }
}
