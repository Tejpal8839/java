public class SwapWithOutThirdVariable {
    public static void main(String[] args) {
        int a=10;
        int b=30;
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("Swapped a is:"+a);
         System.out.println("Swapped b is:"+b);
        
    }
}
