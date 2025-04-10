
public class PrintEachCharacterWhichUpperCaseOfString2 {
    public static void main(String[] args) {
        String s1="MohanTEJPALhelloSINGH";
        int i=0;
        while(i<s1.length())
        {
            char c= s1.charAt(i);
            if(c>=65 && c<=90)  //if(c>='A' && c<='Z')
            System.out.println(c);
        i++;
        }
    }
}
