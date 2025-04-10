import java.util.Scanner;

public class StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        if(isStrong(n))
        System.out.println(n+" is a Stong number ");
        else
        System.out.println(n+"is not a Stong number ");

        
       

    }
    public static boolean  isStrong(int n)
    {
        int sum=0,num=n;
        while(n>0)
        {
            //int rem=n%10;
            //  int fact= getFactorial(rem);
            sum=sum+getFactorial(n%10);
           
        n/=10;     
       }
      return sum==num;
    }
    public static int getFactorial(int n)
    {
        int fact=1;
        int i=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
