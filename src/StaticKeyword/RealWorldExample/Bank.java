package StaticKeyword.RealWorldExample;

// Bank class
public class Bank {
    // Static variable shared among all branches (instances of Bank)
    private static int totalAccounts = 0;

    // Instance variable for the branch-specific account count
    private int branchAccounts = 0;

    // Constructor increments the totalAccounts when a new branch is created
    public Bank() {
        totalAccounts++;
    }

    // Method to open an account in a specific branch
    public void openAccount() {
        branchAccounts++;
    }

    // Method to get the total number of accounts across all branches
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to get the branch-specific account count
    public int getBranchAccounts() {
        return branchAccounts;
    }
}
