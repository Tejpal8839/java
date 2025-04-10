/*For the given CP and SP. Calculate %Loss.
CP=120;
SP=90;
 */


public class CpSpLoss {
    public static void main(String[] args) {
        
        double cp=120;
        double sp=90;
        double loss = cp-sp;

        double lossPercentage=loss*100/cp;
        System.out.println("Loss Percentage is: "+ lossPercentage);
    }
}
