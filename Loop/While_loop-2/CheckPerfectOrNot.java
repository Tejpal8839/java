import java.util.Scanner;
public class CheckPerfectOrNot {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n/2)
        {
            if(n%i==0){
            sum+=i;
            System.out.println(i+" ");
            }

            i++;

        }
        if(sum==n)
        System.out.println("\n"+n +"is a Perfect Number");
        else
        System.out.println(n+" is not a Perfect Number ");
    }
}
