//Checkin the palindrome or not using the In place algorithm in which we are taking two pointers 1.start=0 and 2.end=str.length()-1;

import java.util.Scanner;

public class PalindromeStringUsingInPlaceAlgorithm8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ente the String: ");
        String s= sc.nextLine();
        if(isPalindrome(s))
        System.out.println(s+" is a Palindrome String");
        else
        System.out.println(s+" is not a Palindrome string");
}

        public static boolean isPalindrome(String s)
        {
            s=s.toLowerCase();
            int start=0, end= s.length()-1;
            while(start<end)
            {
                if(s.charAt(start)!=s.charAt(end))
                return false;

                start++;
                end--;
            }
            return true;

        }
}