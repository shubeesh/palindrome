public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int numberClone = number;
        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number *= 10;
            number += lastDigit;
            number /= 10;
        }

        return reverse == numberClone;


    }
}
