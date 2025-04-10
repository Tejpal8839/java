public class FactorialWhileLoop {
    public static void main(String[] args) {
        int n=6;
    int fact=1;
    int i=1;
    while(i<=n)
    {
        fact*=i;
        i++;
    }
    System.out.println(n+"!= "+fact);
    }
    
}
