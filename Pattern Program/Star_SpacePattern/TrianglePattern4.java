
import java.util.Scanner;

public class TrianglePattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of Rows: ");
       int n= sc.nextInt();
       printPattern(n);
    }

    public static void printPattern(int n)
    {
    int star=n ; 
    int space=0;
    
   for(int i=1;i<=n;i++)     // This row for the number of rows 
   {
      
       for(int j=1;j<=space;j++)
           System.out.print("   ");
       for(int j=1;j<=star;j++)
           System.out.print("*  ");
           
    star--;space++;
       System.out.println();
   }
}
}
