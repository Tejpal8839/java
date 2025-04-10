
import java.util.Scanner;

// This is the find the power of the given numben
// a superscript b=> a is multipled b times
// a*a*a*.......b times
// a to the power of the -b is equivalent to the 1/a to the power of a....

public class PowerOfNumber {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a : ");
        double a= sc.nextDouble();
        double temp1=a;
        System.out.println("Enter b : ");
        double b= sc.nextDouble();
        double temp2=b;
        if(b<0)
        {
            a=1.0/a;
            b=-b;
        }
        int i=1;
        double pow=1;
        while(i<=b)
        {
            pow=pow*a;
            i++;
        }
        System.out.println(temp1 +" to Power of "+ temp2 +" is : "+pow);
    }
}
