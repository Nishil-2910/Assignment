public class CheckingAccount extends Account {
    // Checking Account supports the overdraft
    // Let withdraw limit be 7000 Rs.
    // Let overdraft charge be 5%
    double overdraft = 5000;
    double overdraftCharge = 0.05;

    public CheckingAccount() {
    }
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    //overriding withdraw() method.
    public void withdraw(double money) {
        // condition for over drafting money
        if (getBalance() - money < -overdraft) {
            super.withdraw(money); // parent class method to withdraw amount.
            setBalance(getBalance()-money*overdraftCharge);
            System.out.println(money*overdraftCharge+"Rs. charge is deducted from your account.");
        } else {
            System.out.println("Can't overdraft money more than " + overdraft + " Rs.");
        }
    }
}
