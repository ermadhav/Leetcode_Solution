class Bank {
    private long[] balance; // Stores balances of all accounts

    // Constructor to initialize the bank with given balances
    public Bank(long[] balance) {
        this.balance = balance;
    }

    // Method to transfer money between two accounts
    public boolean transfer(int account1, int account2, long money) {
        // Validate account numbers
        if (!isValidAccount(account1) || !isValidAccount(account2))
            return false;

        // Check if account1 has enough balance
        if (balance[account1 - 1] < money)
            return false;

        // Perform transfer
        balance[account1 - 1] -= money;
        balance[account2 - 1] += money;
        return true;
    }

    // Method to deposit money into an account
    public boolean deposit(int account, long money) {
        if (!isValidAccount(account))
            return false;

        balance[account - 1] += money;
        return true;
    }

    // Method to withdraw money from an account
    public boolean withdraw(int account, long money) {
        if (!isValidAccount(account))
            return false;

        if (balance[account - 1] < money)
            return false;

        balance[account - 1] -= money;
        return true;
    }

    // Helper method to check if the account number is valid
    private boolean isValidAccount(int account) {
        return account >= 1 && account <= balance.length;
    }
}
