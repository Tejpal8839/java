import java.util.Scanner;

public class EachEvenDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0)
        {
            int rem= n%10;
            if(rem%2==0)
            System.out.print(rem+" ");

            n/=10;
        }
    }
}
