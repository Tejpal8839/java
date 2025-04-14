public class BiggestSmallestDifference {
    public static void main(String[] args) {
        
        int[] a= { 3,12,34,34,55,77,56,100};
       int difference= getBiggestSmallestDifference(a);
       System.out.println("Difference is "+difference);

    }
    public static int  getBiggestSmallestDifference(int[] a){

        int biggest=a[0];
        int smallest=a[0];
         for(int x: a){
            if(x>biggest){

                biggest=x;
            }

            if(x<smallest){

                smallest=x;
            }

            
         }
         return biggest-smallest;
    }
}
