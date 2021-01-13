public class Palindrome {

    public static void main (String[] args) {
        checkPalindrome("level");
    }

    public static void checkPalindrome(String word) {
        String anotherWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char wordChar = word.charAt(i);
            anotherWord += String.valueOf(wordChar);
        }
        if (word.equals(anotherWord)) {
            System.out.println("This " + word + " is a palindrome");
        } else {
            System.out.println("This " + word + " is not a palindrome");
    }
}
