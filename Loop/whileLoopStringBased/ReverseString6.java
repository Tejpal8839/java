import java.util.Scanner;

public class ReverseString6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        String rev=" ";
        int i=0;
        while(i<str.length())
        {
            char c= str.charAt(i);
            rev=c+rev;
            i++;
        }
        System.out.println(rev);

    }
}
/* 
 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        String rev=" ";
        int i=str.length()-1;
        while(i>=0)
        {
            char c= str.charAt(i);
            rev=rev+c;
            i--;
        }
        System.out.println(rev);

    }
 */
