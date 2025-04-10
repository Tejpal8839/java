import java.util.Scanner;

public class OddDigitNumber3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        while(n>0)
        {
            int rem=n%10;
           if(rem%2==1)
                System.out.print(rem+" ");

        n/=10;
        }
}
}