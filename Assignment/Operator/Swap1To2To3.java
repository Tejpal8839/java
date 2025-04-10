/*For the given three numbers. Swap 1st into 2nd, 2nd into 3rd and 3rd into 1st  number.
With using fourth variable*/


import java.util.Scanner;
public class Swap1To2To3 {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int temp=b;
        b=a;
        a=c;
        c=temp;
        System.out.println("Swapped values is: ");
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        System.out.println("c is: "+c);


    }

}
