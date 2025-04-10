import java.util.Scanner;
public class LeapYearOrNotMethod1
 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();

        if(year%100!=0)
        {
            if(year%4==0)
                System.out.println(year+"is a Leap year");
            else
                System.out.println(year+"is not a Leap year");
            
        }
        else
        {
            if(year%400==0)
            System.out.println(year+"is a Leap year");
            else
            System.out.println(year+"is not a Leap year");
        }

    }
}


/*test case   1992 is a leap year
 *            1993 is not a leap year
 *           both are not century year so true by the first if conditon
 * 
 * For century year
 *            in which else part is running 
 *           1900 is not a leap year
 *           2000 is a Leap year
 * 
 * for century year we are taken remainder for 400
 *  
 */
