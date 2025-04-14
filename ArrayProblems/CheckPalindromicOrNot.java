public class CheckPalindromicOrNot {
    public static void main(String[] args) {
         int[] a= {10,20,40,30,20,10};
        if(ispalindromic( a)){
            System.out.println("Array is Palindromic");
        }
        else
        {
            System.out.println("Array is not Palindromic ");
        }
    }
    public static boolean ispalindromic(int[]a){
        int start=0;
        int end=a.length-1;

        while(start<end){
            if(a[start]!=a[end]){

                return false;
            }

             start++;
             end--;
        }
        return true;
    }
}
