
import java.util.Scanner;



public class SumOfFactor {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n/2)
        {
            if(n%i==0){
            sum+=i;
            }

            i++;

        }
        System.out.println("Sum of the Factor is : "+sum);
    }
}
