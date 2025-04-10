
import java.util.Scanner;

public class PalindromeString7 {
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
        s=s.toLowerCase();//String is converting into lower case 
        String rev="";
        int i=0;
        while(i<s.length())
        {
            rev=s.charAt(i)+rev;

        i++;
        }
    return rev.equals(s);
    }
}
