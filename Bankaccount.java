public class Bank Account {
  private String firstName:
  private String lastName:
  private int accountID:
  private double balance;
//Initialize balance to zero
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
//Setters & getters for firstName, lastName, and accountID
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
//Method to set account id
public void setAccountID(int accountID) {
    this.accountID = accountID;
}
//Method to get balance
public double getBalance() {
    reutrn balance;
}
//Method to get account summary
public void accountSummary() {
  System.out.println("Account Information:");
  System.out.println("First Name: " + firstName);
  System.out.println("Last Name: " + lastName);
  System.out.println("Account ID: " + accountID);
  System.out.println("Balance: $" + balance);
}
}
