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

public void setFirstName(String firstName) {
  this.firstName = firstName;
}

public String getFirstName() {
    return firstName;
}

public void setLastName(String lastName) {
  this.lastName = lastName;
}

public String getLastName() {
    return lastName;
}

public void setAccountID(int accountID) {
    this.accountID = accountID;
}

public double getBalance() {
    reutrn balance;
}

public void accountSummary() {
  System.out.println("Account Information:");
  System.out.println("First Name: " + firstName);
  System.out.println("Last Name: " + lastName);
  System.out.println("Account ID: " + accountID);
  System.out.println("Balance: $" + balance);
}
}
