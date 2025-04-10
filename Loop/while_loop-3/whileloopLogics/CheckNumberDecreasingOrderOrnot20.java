import java.util.Scanner;

public class CheckNumberDecreasingOrderOrnot20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        boolean x= isIncreasingDigit(n);
        System.out.println(x);
        
        }
    public static boolean isIncreasingDigit(int n)
    {
        int oldDigit=n%10;
        n=n/10;

        while(n>0)
        {
            int newDigit=n%10;
            if(newDigit<oldDigit)
                return false;

            newDigit=oldDigit;
            n/=10;
        }
        return true;
        
}
}
