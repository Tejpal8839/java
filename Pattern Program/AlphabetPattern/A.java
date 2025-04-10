import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of Rows: ");
       int n= sc.nextInt();
       printPattern(n);
    }
       public static void printPattern(int n)
       {
            
            int mid=n/2+1;
            int p=mid;int q=mid;
           for(int i=1;i<=n;i++)
           {
               for(int j=1;j<=n;j++)
               {
                    if(i==p||j==q||i==mid+1||j>p)
                    System.out.print("* ");
                    else
                    System.out.println("  ");
                }
                System.out.println();
            }
        }
    
    }
