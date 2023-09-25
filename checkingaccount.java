 class Checking Account extends BankAccount {
  private double interestRate;

  public CheckingAccount() {
    super();
    this.interestRate = 0.0;
  }

public void processWithdrawl(double amount) {
  if (amount > geBalance()) {
       System.out.println("Warning: Insufficient funds. $30 overdraft fee charged.");
       super.withdrawl(30.0);
  }
  super.withdrawl(amount);
}

public void displayAccount() {
  super.accountSummary();
  System.out.println("Interest Rate: " interestRate);
}

public void setInterestRate(double interestRate) {
  this.interestRate = interestRate;
}
  public double getInterestRate() {
    return interestRate;
  }
}
