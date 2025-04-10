import java.util.Scanner;
public class ValidTriangle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side1: ");
		int a=sc.nextInt();
		System.out.println("Enter the side2: ");
		int b=sc.nextInt();
		System.out.println("Enter the side3: ");
		int c=sc.nextInt();

		String result=(a+b>c && b+c>a && a+c>b)?"Valid Triangle": "Invalid Triangle";
		System.out.println(result);
		
	}
}