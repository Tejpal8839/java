/*Write a java Program to take user in put and
print each digits of the number which are greater than or equals to 5 on by one .*/
import java.util.Scanner;
public class PrintReverse
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        int i=1;
       while(i<=n)
       {
        System.out.println(n%10);
        n/=10;
        i++;
       }
    }
}