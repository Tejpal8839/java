 import java.util.Scanner;
 public class PrimeNumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int i=1;
        int count=0;
        while(i<=n/2)
        {
            if(n%i==0){
            count++;
            }
            i++;
        }
        if(n>1 && count==1)
        System.out.println(n+" is a Prime Number");
        else
        System.out.println(n+" is not a Prime number ");
    }
}
