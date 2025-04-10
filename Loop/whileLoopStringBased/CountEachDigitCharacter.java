public class CountEachDigitCharacter {
    public static void main(String[] args) {
        String s1="MohanTEJPAL8839262945helloSINGH";
        int i=0;
        int count=0;
        while(i<s1.length())
        {
            char c= s1.charAt(i);
            if(c>=48 && c<=57){
                count++; 
            System.out.print(c+" ");
            } 
            
        i++;
        }
        System.out.println(count);
    }  
}
