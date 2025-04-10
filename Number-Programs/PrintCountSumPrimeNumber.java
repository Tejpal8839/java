
import java.util.Scanner;

public class PrintCountSumPrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the min value where from : ");
        int min= sc.nextInt();
        System.out.println("Enter the Max value where to >");
        int max= sc.nextInt();
        
        int count=0;
         
         for (int i = min; i <max; i++) {

             if(isPrime(i) && isPrime(getSum(i)))
             {
                System.out.println(i+" ");
                count++;
             }
         }
         System.out.println("Total count is: "+ count);
    }
    public static int getSum(int n){
        int sum=0;
        while(n>0)
        {
        
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static boolean isPrime(int n)
    {
        if(n<2)
        return false;
        if(n==2 || n==3)
        return true;

        if(n%2==0)
        return false;

        // for(int i=3;i<n/2;i+=2)
        for(int i=3;i*i<n;i+=2) 
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    }

