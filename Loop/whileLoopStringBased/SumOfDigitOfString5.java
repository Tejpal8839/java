
public class SumOfDigitOfString5 {
    public static void main(String[] args) {
        String s1="tejpalsingh883";
        int i=0;
        int sum=0;
        while(i<s1.length())
        {
            char c=s1.charAt(i);
            if(c>=48 && c<=57)
            {
                sum=sum+c-48;
            }
            i++;

        }
        System.out.println("sum of digit is: "+sum);
    }
}
