import java.util.Scanner;
public class UpperCaseOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side1: ");
		char c=sc.next().charAt(0);
		String result=(c>=65 && c<=90)?c+" is UpperCase": c+" is NOT UpperCase";
		System.out.println(result);
		
	}
}