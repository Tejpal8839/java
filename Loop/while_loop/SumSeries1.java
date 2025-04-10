public class SumSeries1
{
    public static void main(String[]args)
    
        int sum=0;
        int i=1;
        int j;
        while(i<=100)
        {
             j=i*(i+1);
             sum=sum+j;
        }
        System.out.println(sum+"is the sum of the series");

    }
}