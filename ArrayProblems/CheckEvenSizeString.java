
public class CheckEvenSizeString{
    public static void main(String[] args) {
         
        String[] str= {"abc","xy","pqrstuv","aaab","bbbb"};
        getEvenSizeString(str);

    }
    public static void  getEvenSizeString(String[]str){

        int count=0;
        for(String s:str){
            if(s.length()%2==0)
            {
                System.out.println(s);
                count++;
            }
        }
        System.out.println("Total Even Number String are : "+count);

    }
}