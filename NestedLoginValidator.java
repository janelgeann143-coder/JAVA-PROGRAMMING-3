public class NestedLoginValidator {
    public static void main(String[] args) {
        String correctUsername = "admin_user";
        String correctPassword = "SecurePassword123";
        boolean isAccountLocked = false;

        String inputUsername = "admin_user";
        String inputPassword = "SecurePassword123";
        boolean inputAccountLocked = false;

       
        if (inputUsername.equals(correctUsername)) {
          
            if (inputPassword.equals(correctPassword)) {
                
                if (!inputAccountLocked) {
                    System.out.println("SUCCESS: Login granted!");
                } else {
                    System.out.println("FAILURE: Account is locked.");
                }
            } else {
                System.out.println("FAILURE: Incorrect password.");
            }
        } else {
            System.out.println("FAILURE: Incorrect username.");
        }
    }
}
