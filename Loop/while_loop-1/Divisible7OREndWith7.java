  

public class Divisible7OREndWith7 {
    public static void main(String[] args) {
        
        int i=1;
        int count=0;
        while(i<=100)
        {
            if(i%7==0 || i%10 ==7)
            {
                count++;
                System.out.println(i);
            }
            i++;
            
        }
        System.out.println("count is : "+count);
    }
}
