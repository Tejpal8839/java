
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        
        if(isArmastrongNumber(n))
        System.out.println(n+" is a Armstrong Number");
        else
        System.out.println(n+" is not a Armstrong Number");

    }
    public static boolean isArmastrongNumber(int n)
    {
       int count=getCount(n);
       int sum=0;
       int num=n;
        while(n>0)
        {
            int rem=n%10;
            sum+=getPower(rem,count);
        n/=10;
        }
        return sum==num;
        
    }
    public static int getCount(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n/=10;
        }
        return count;
    }
    public static int getPower(int a,int b)
    {
        int pow=1;
        for(int i=1;i<=b;i++)
        {
            pow=pow*a;
        }
        return pow;
    }
}
