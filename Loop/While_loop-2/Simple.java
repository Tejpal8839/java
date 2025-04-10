
public class Simple {
    public static void main(String[] args) {
        {
            int num=38;
            int sum=0;
            int s=0;
            while(num>0)
            {
                int rem= num%10;
                sum=sum+rem;
                
            }
            while(sum>0)
                {
                    int r=sum%10;
                    s=s+r;
                }
            System.out.println("single digit is:"+s);
            
        }
    }
}
