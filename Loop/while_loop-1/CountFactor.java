import java.util.Scanner;

public class CountFactor {
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
        System.out.println( "Count of the Factor is: "+ count);
    }
}
