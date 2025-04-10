public class CircularPrimeNumberOrNot {
    public static void main(String[] args) {
        
    }
    public static boolean isPrime(int n)
    {
        if(n<2)
        return false;
        if(n==2 || n==3)
        return true;

        if(n%2==0)
        return false;

        // for(int i=3;i<n/2;i+=2)
        for(int i=3;i*i<n;i+=2) 
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}
