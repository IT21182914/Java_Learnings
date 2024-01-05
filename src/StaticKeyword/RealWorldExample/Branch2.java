package StaticKeyword.RealWorldExample;

// Branch2 class
public class Branch2 {
    public static void main(String[] args) {
        Bank branch2 = new Bank();
        branch2.openAccount();

        System.out.println("Branch2 Accounts: " + branch2.getBranchAccounts());
        System.out.println("Total Accounts: " + Bank.getTotalAccounts());
    }
}
