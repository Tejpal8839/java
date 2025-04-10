import java.util.Scanner;
public class ThreeDigitNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		String result=(n>=100 && n<=999)?n+" is 3-digit Number": n+" is NOT a 3-digit Number";
		System.out.println(result);
		
	}
}