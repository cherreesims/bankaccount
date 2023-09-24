public class TestBankAccount
  public static void main(String[] args) {
    CheckingAccount checkingAccount = new CheckingAccount();
    checkingAccount.setFirstName("John");
    checkingAccount.setLastName("Sims");
    checkingAccount.setAccountID(45678);
    checkingAccount.deposit(1000.0);
    checkingAccount.setInterestRate(0.02);

    checkingAccount.displayAccount();

  }
  }
