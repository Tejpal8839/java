import java.util.Scanner;

public class ToCheckSysmol {
    
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side1: ");
		char c=sc.next().charAt(0);
		String result=(!((c>=65 && c<=90)||(c>=97 && c<=122)))?c+"is Symbol ": c+" is NOT a Symbol ";
		System.out.println(result);
}
}