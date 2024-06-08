package strings;

public class Palindrome {

    public static boolean isPalindrome(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "moom";
        boolean result = isPalindrome(name);
        System.out.println(result ? "Palindrome" : "Not Palindrome");
    }
}
