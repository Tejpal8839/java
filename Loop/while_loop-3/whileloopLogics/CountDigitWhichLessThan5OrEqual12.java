import java.util.Scanner;

public class CountDigitWhichLessThan5OrEqual12 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int count=0;
        while(n>0)
        {
            int rem= n%10;
            if(rem<=5){
            System.out.print(rem+" ");
            count++;
            }

        n/=10;
        }
        System.out.println();
        System.out.println("Count of digit which is less than or equal to :"+count);
        
    }
}
