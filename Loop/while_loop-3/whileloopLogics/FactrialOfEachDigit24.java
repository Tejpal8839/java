import java.util.Scanner;
public class FactrialOfEachDigit24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();
        getFactorialDigit(n);


    }
    public static void getFactorialDigit(int n)
    {
        while(n>0)
        {
        int rem=n%10;
        System.out.println(rem+"!="+isFactroial(rem));
        n/=10;
        }
    }
    public static int isFactroial(int n)
    {
        int fact=1;
        int i=1;
        while(i<=n)
        {
            fact*=i;
            i++;
        }
        return fact;
    }
}
