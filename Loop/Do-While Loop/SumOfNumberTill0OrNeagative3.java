
import java.util.Scanner;


public class SumOfNumberTill0OrNeagative3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number");
        int n=0;
        do { 
            sum+=n;
            n=sc.nextInt();
        } while (n>0);
        System.out.println(sum);
    }
     
}
