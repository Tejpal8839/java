import java.util.Scanner;

public class Pattern8 {
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
    int num=n*(n+1)/2;
    
   for(int i=1;i<=n;i++)     
   {
      
       for(int j=1;j<=space;j++)
           System.out.print("\t");
       for(int j=1;j<=star;j++)
           System.out.print(num--+"\t");
       

           
    star--;space++;
       System.out.println();
   }
} 
}-
