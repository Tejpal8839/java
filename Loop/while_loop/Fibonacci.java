// Fibonacci Series in which printing the terms which we wanted too
// T(0)=0; T(1)=1; T(2)=1; T(3)=2; T(4)=3; T(5)=5
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3=1;
        if(n==0){
        System.out.println(0);
        return;
        }
        System.out.print(n1+" "+n2+" ");
        int i=1;
        while(i<=n-1)
        {
              n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            i++;
        }
    }
}
