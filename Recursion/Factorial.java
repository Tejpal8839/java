import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();

        int result= factorialOfNumber(n);
        System.out.println("Factorial of "+n+" is : "+result);
    }
    public static int factorialOfNumber(int n)
    {
        if(n>1){
            return n * factorialOfNumber(n-1);
        }
        
        else
        {
            return n;
        }
    }
}
