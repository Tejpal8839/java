import java.util.Scanner;

public class FibonacciTermOnly {
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
        
        int i=1;
        while(i<=n-1)
        {
              n3=n1+n2;
            //System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            i++;
        }
        System.out.println(n3);
    }
}
