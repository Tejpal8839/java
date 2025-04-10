/*For the given CP and SP. Calculate %Profit.
CP=120;
SP=160;
 */
public class CpSpProfit {
    public static void main(String[] args) {
        
        double cp=120;
        double sp=160;
        double profit=sp-cp;
         double profitPercentage=profit*100/cp;
        System.out.println("Profit Percentage is :"+profitPercentage);

    }
}
