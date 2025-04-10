import java.util.Scanner;

public class MatrixPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of Rows: ");
       int n= sc.nextInt();
       printPattern(n);
    }
       public static void printPattern(int n)
       {
           for(int i=1;i<=n;i++)
           {
               for(int j=1;j<=n;j++)
               {
                   System.out.print("("+i+","+j+")\t");
                }
                System.out.println();
            }
        }
    }