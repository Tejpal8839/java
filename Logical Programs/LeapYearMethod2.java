import java.util.Scanner;
public class LeapYearMethod2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(((year%100!=0)&&(year%4==0))|| year%400==0)
        System.out.println(year+"is a leap year");
        else
        System.out.println(year+"is a not a leap year");

    }
}
