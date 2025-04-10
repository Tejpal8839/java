import java.util.Scanner;

public class CountOddDigit11 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int count=0;
        while(n>0)
        {
            int rem= n%10;
            if(rem%2==1)
            count++;

        n/=10;
        }
        System.out.println("Total Odd Digits in Numbers are : " +count);
    }
}
