class reverse_Element {
    public static void main(String[] args) {
        
        int[] a = {10,23,45,56,76};
        reverse(a);

    }
    public static void reverse(int[]a){
        int start=0;
        int  end=a.length-1;

        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;

        }
    }
}
