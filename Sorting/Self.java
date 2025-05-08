import java.util.*;
public class Self {
   public static void main(String[] args) {
       int[] a= {2,3,433,54,5,43,5,4,5,6,533,8,9,87,874,11,23,4};
       System.out.println("Before sorting "+ Arrays.toString(a));
       divide(a,0,a.length-1);
       System.out.println("Before sorting "+ Arrays.toString(a));

   } 
   public static void divide(int[]a , int start, int end){
       if(start<end){

           int mid= start+(end-start)/2;
              divide(a, start, mid);
              divide(a, mid+1, end);
              merge(a,start,mid,end);
       }
   }
   public static void merge(int[]a,int start,int mid,int end)
   {
    int [] merged=new int[end-start+1];
    int indx1=start,indx2=mid+1,x=0;
    while(indx1<=mid && indx2<end)
    {
        if(a[indx1]<=a[indx2])
        merged[x++]=a[indx1++];
        else
        merged[x++]=a[indx2++];


    }
    while(indx1<=mid)
    merged[x++]= a[indx1++];
    while(indx2<=end)
    merged[x++]= a[indx2++];;
    
    for(int i=start,j=0;i<merged.length;i++,j++)
    a[i]= merged[j];
   }
}
