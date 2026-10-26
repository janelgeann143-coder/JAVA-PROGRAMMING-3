public class AtmTransactionAuthorizer {
    public static void main(String[] args) {
       
        String correctUser = "john_doe";
        int correctPin = 1234;
        
        String inputUser = "john_doe";
        int inputPin = 1234;

        double accountBalance = 1500.0;
        double withdrawalAmount = 300.0;
        String accountTier = "Gold"; 

        boolean isAuthorized = false;
        String denialReason = "";

        
        if (inputUser.equals(correctUser)) {
            if (inputPin == correctPin) {
                
               
                double dailyLimit = 0.0;
                
            
                double feePercentage = 0.0;
                switch (accountTier) {
                    case "Bronze":
                        dailyLimit = 200.0;
                        feePercentage = 0.02; 
                        break;
                    case "Silver":
                        dailyLimit = 500.0;
                        feePercentage = 0.015; 
                        break;
                    case "Gold":
                        dailyLimit = 1000.0;
                        feePercentage = 0.01; 
                        break;
                    case "Platinum":
                        dailyLimit = 5000.0;
                        feePercentage = 0.005;
                        break;
                    default:
                        dailyLimit = 100.0;
                        feePercentage = 0.03;
                        break;
                }

                
                if (withdrawalAmount <= accountBalance) {
                    if (withdrawalAmount <= dailyLimit) {
                        double fee = withdrawalAmount * feePercentage;
                        double totalDeducted = withdrawalAmount + fee;
                        
                        if (totalDeducted <= accountBalance) {
                            isAuthorized = true;
                        } else {
                            denialReason = "Denied: Insufficient balance to cover withdrawal plus transaction fee.";
                        }
                    } else {
                        denialReason = "Denied: Withdrawal amount exceeds tier daily limit of $" + dailyLimit;
                    }
                } else {
                    denialReason = "Denied: Insufficient account balance.";
                }

            } else {
                denialReason = "Denied: Incorrect PIN.";
            }
        } else {
            denialReason = "Denied: Incorrect username.";
        }

      
        if (isAuthorized) {
            System.out.println("TRANSACTION APPROVED: Please take your cash.");
        } else {
            System.out.println("TRANSACTION DENIED -> " + denialReason);
        }
    }
}
