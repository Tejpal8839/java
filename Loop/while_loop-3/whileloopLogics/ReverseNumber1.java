
import java.util.Scanner;



public class ReverseNumber1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        while(n>0)
        {
            int rem=n%10;
            System.out.println(rem);
            n/=10;
        }
    }
}
