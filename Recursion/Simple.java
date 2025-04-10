


public class Simple {
    public static void main(String[] args) {
      
        System.out.println("Main Starts");
        printNumber(1);
        System.out.println("Main Ends");
    }
    public static void printNumber(int n)
    {
        if(n<=10){

            System.out.println(n);
            printNumber(n+1);
        }
        else
        System.out.println("Else block n is "+n);
    }

}
