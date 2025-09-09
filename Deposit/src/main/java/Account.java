public class Account {

    double balance;

    public Account() {
        this.balance = 0;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public double withdraw(double money) {
        if (this.balance < money) {
            return 0;
        }
        this.balance -= money;
        return money;
    }

    public double getBalance() {
        return this.balance;
    }
}
