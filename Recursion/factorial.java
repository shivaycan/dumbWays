package Recursion;

public class factorial {

    int factoriall(int n) {
        if (n == 0) {
            return 1;
        }
        int f = n * factoriall(n - 1);
        return f;
    }

    public static void main(String args[]) {
        factorial ab = new factorial();
        int number = 5; // Replace 5 with any number for which you want to calculate the factorial
        int result = ab.factoriall(number); //baba
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
