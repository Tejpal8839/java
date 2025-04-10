
// This is the Program of the factor of the given number ........
import java.util.Scanner;
class Factor
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n/2)
        {
            if(n%i==0){
            System.out.print(i+" ");
            }
            i++;
        }
    }
}