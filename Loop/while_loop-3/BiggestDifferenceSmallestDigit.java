import java.util.Scanner;

public class BiggestDifferenceSmallestDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n= sc.nextInt();

        int big= n%10;
        int small= n%10;
        n= n/10;

        while(n>0)
        {
            int rem= n%10;
            if(rem>big)
            big=rem;

            if(rem<small)
            small= rem;

        n= n/10;
        }
        System.out.println("Difference is : "+(big-small));
    }
}
