/*
Palindrome adalah suatu kata, frasa, angka, maupun susunan lainnya apabila dibaca dari
depan atau belakang bunyinya tetap sama (spasi antara huruf-huruf biasanya diperbolehkan) contoh “ada”, “level”.
Buatlah sebuah function untuk mengindikasi sebuah kata dari payload yang dikirim. Jika
kata tersebut Palindrome maka akan mencetak “Kata `level` adalah palindrome” selain itu
“Kata ‘[payload]’ bukan palindrome”
*/

public class Main {

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
