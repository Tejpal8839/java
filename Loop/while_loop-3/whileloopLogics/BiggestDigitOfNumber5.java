import java.util.Scanner;

public class BiggestDigitOfNumber5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int big=n%10;
        n/=10;
        while(n>0)
        {
            int rem=n%10;
            if(rem>big)
                big=rem;
          n/=10;  
        }
        System.out.println("Biggest Number is: "+big);
    }
}
