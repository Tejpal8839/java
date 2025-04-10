import java.math.*;
public class StartingDigit {
    public static void main(String[] args) {
        int n=5346;
        int count=0;
        if(n!=0)
        {
            count++;
            n/=10;
        }
    
        int num=(n/(Math.pow(10, (count-1))))%10;
    }
}
