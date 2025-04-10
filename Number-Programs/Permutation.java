import java.util.Scanner;

public class Permutation {
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n: ");
          int n=sc.nextInt();
          System.out.println("Enter r : ");
          int r=sc.nextInt();
          int totalSelection = getPermutation(n,r);
          System.out.println("Total Selections is "+n+"C"+r+" is :"+totalSelection);

    }
    public static int getPermutation(int n,int r)
    {
        int comb=1;
        for(int i=0;i<r;i++)
        {
            comb=(comb*(n-i))/(i+1);
        }
        
    return comb;
}
}