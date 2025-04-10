
import java.util.Scanner;


public class PasswordValidation5 {
     private static String password ="abc@123";
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        
        do { 
            System.out.println("Enter the Password: ");
            String pwd=sc.nextLine();
        } while (true);


    }
        public static boolean validationPassword(String pwd)
        {
            return password.equals(pwd);
        }
    
}
