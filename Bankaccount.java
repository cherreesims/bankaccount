public class Bank Account {
  private String firstName:
  private String lastName:
  private int accountID:
  private double balance;

  public BankAccount() {
      this.balnance = 0.0;
}

public void deposit(double amount) {
    if (amount > 0) {
        this.balance += amount;
    }
}

public void withdrawl(double amount) {
    if (amount > 0 && amount <= balance) {
        this.balance -= amount;
    }
}
