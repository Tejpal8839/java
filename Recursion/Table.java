
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        int i=1;
        tableOfNumber(n,i);


    }
    public static void tableOfNumber(int n,int i)
    {
        if(i<=10)
        {
            System.out.println("Table of "+n+" is : "+n*i);
            tableOfNumber(n, i+1);
        }
    }
}
