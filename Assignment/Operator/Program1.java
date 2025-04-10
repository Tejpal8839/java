class Program1
{
    public static void main(String[] args) {
        int n=5783;
        int temp=n;
        //Print the last digit of the number
        System.out.println(n%10);
        //Print the last two digit of the number
        System.out.println(n%100);
        //Remove the last digit of the number
        System.out.println(temp/10);
        //Remove the last two digit of the number
        System.out.println(temp/100);
    
    }
     
}