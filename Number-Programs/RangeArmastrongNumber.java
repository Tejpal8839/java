public class RangeArmastrongNumber {
    
    


public class RangeArmstrongNumber {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=10000;i++)
        {
         
            if(isArmastrongNumber(i))
            {
                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println("Total Count of Armstrong Numbers is : "+count);
        
       
    }
    public static boolean isArmastrongNumber(int n)
    {
       int count1=getCount(n);
       int sum=0;
       int num=n;
        while(n>0)
        {
            int rem=n%10;
            sum+=getPower(rem,count1);
        n/=10;
        }
        return sum==num;
        
    }
    public static int getCount(int n)
    {
        int count1=0;
        while(n>0)
        {
            count1++;
            n/=10;
        }
        return count1;
    }
    public static int getPower(int a,int b)
    {
        int pow=1;
        for(int i=1;i<=b;i++)
        {
            pow=pow*a;
        }
        return pow;
    }
}

}
