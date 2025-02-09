//Write a function that tests whether a string is a palindrome
import java.util.*;
public class Question1 {

    public static boolean isPalindrome(String s){
        HashMap<String, Integer> S = new HashMap<>();
        HashMap<String, Integer> T = new HashMap<>();

        if(s.length() <= 1){
            return false;
        }

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(!String.valueOf(s.charAt(left)).equals(String.valueOf(s.charAt(right)))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome("repaper"));
    }
}