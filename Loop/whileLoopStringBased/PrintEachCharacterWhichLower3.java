
public class PrintEachCharacterWhichLower3 {
    public static void main(String[] args) {
        String s1="MohanTEJPALhelloSINGH";
        int i=0;
        while(i<s1.length())
        {
            char c= s1.charAt(i);
            if(c>=97 && c<=122)  //if(c>='a' && c<='z')
            System.out.println(c);
        i++;
        }
    }
}
