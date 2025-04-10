// write a program  to print nth row of Pascal Triangle..
import java.util.Scanner;
public class PascalTriangle {
  
        public static void main(String[] args)
        {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter n: ");
              int n=sc.nextInt();
              printPascalRow(n);
              
    
        }
        public static void printPascalRow(int n)
        {
            for(int i=0;i<=n;i++){
                int comb=1;
                for(int j=0;j<i;j++)
                {
                    comb=comb*(n-j)/(j+1);
                }
                System.out.print(comb+" ");
            }
            
        }
    }

