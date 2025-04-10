// This is the Program of the total factors of the given number ........

import java.util.Scanner;
public class FactorPrintAndFactorCount {
    
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
            System.out.print(i+" ");
            }
            i++;
        }
        System.out.println("\nTotal Factors are: "+count);
    }
}

