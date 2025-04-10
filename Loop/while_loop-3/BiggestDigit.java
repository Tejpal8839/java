

import java.util.Scanner;

public class BiggestDigit {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int big= n%10;
        n=n/10;
        while(n>0)
        {
            int rem= n%10;
            if(rem>big)
            big= rem;

        n/=10;
        }
        System.out.println("Biggest Digit is : "+big);

    }
}
