package StaticKeyword.RealWorldExample;

// Branch1 class
public class Branch1 {
    public static void main(String[] args) {
        Bank branch1 = new Bank();
        branch1.openAccount();
        branch1.openAccount();

        System.out.println("Branch1 Accounts: " + branch1.getBranchAccounts());
        System.out.println("Total Accounts: " + Bank.getTotalAccounts());
    }
}
