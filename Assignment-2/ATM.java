public class ATM {
    private static int count;
    private final String id;
    private double balance;

    //constructor to initialize id and balance
    public ATM() {
        count++;
        if (count < 10) {
            id = "AC00" + (count);
        } else {
            id = "AC0" + (count);
        }
        balance = 300;
    }

    //getters and setters for balance and ID.
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    //Withdraw method
    public void withdraw(double money) {
        if (balance - money >= 300) {
            balance -= money;
            System.out.println(money + " Rs successfully withdrawn.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw the amount.");
        }
    }

    //deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Rs deposited to your account.");
        System.out.println("Current Balance is : " + balance);
    }

    //method to transfer money.
    public void MoneyTransfer(ATM obj, double amount) {
        if (balance - amount >= 300) {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }
}
