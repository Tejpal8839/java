import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
       int result= logic(n);
       System.out.println("0's is find at step No."+result );
    }
    public static int logic(int n)
    {
        int count=0;
        while(n>0)
        {
            if(n%2==0)
            n/=2;
            else
            n-=1;

        count++;
        }
        return count;
    }
}
