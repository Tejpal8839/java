import java.util.Scanner;

public class PatternLogic5 {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of Rows: ");
       int n= sc.nextInt();
       printPattern(n);
}
public static void printPattern(int n)
{
    if(n%2==0){

        System.out.println("This is available only odd number not for even number ");
        return;
    }
    int mid=n/2+1;
   for(int i=1;i<=n;i++)
   {
       for(int j=1;j<=n;j++)
       {
           if(i==mid||j==mid||i==1 && j>mid || i==n&&j<mid || j==1 && i<mid ||j==n&&i>mid)
           System.out.print("* ");
           else
           System.out.print("  ");
       }
       System.out.println();
   }
}
}
