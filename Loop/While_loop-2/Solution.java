package Loop.While_loop-2;

public class Solution {
    public boolean isThree(int n) {
        int count=0;
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
                count++;
            
            i++;
        }
        return count==3;
        
    }
} {
    
}
