
import java.util.Scanner;

public class FactorialAskUser1 {
  public static void main(String[] args) {
      
    Scanner sc= new Scanner(System.in);
    char c;
    do { 
       System.out.println("Enter the Number: ");
       int n= sc.nextInt();
       System.out.println(n+"!= "+getFactorial(n));
    System.out.println("Press Y/y to Continue.....");
     c= sc.next().charAt(0);
    } while (c=='Y'||c=='y');

  }
  public static int getFactorial(int n)
  {
    int fact=1,i=1;
    while(i<=n)
    {
        fact=fact*i;
    i++;
    }
    return fact;
  }
}
