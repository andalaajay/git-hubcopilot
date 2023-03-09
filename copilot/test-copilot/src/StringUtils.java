public class StringUtils {
    //function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        //convert the string to lowercase
        str = str.toLowerCase();
        //get the length of the string
        int length = str.length();
        //loop through the string
        for (int i = 0; i < length / 2; i++) {
            //check if the characters at the beginning and end of the string are the same
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                //if they are not the same, return false
                return false;
            }
        }
        //if the loop completes, return true
        return true;
    }
    //function to reverse a string
    public static String reverse(String str) {
        //create a new string
        String reversed = "";
        //get the length of the string
        int length = str.length();
        //loop through the string
        for (int i = length - 1; i >= 0; i--) {
            //add each character to the new string
            reversed += str.charAt(i);
        }
        //return the new string
        return reversed;
    }
    //function to convert a string into a uppercase string without return type
public static void toUpperCase(String str) {
        //get the length of the string
        int length = str.length();
        //loop through the string
        for (int i = 0; i < length; i++) {
            //get the character at the current index
            char ch = str.charAt(i);
            //check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                //if it is, subtract 32 from the character to get the uppercase character
                ch -= 32;
            }
            //print the character
            System.out.print(ch);
        }
    }






}
