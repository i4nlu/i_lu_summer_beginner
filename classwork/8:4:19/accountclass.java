public class accountclass {
  public static void main(String[] args) {
    Account account1 = new Account(32955, 2.00);
      System.out.println(account1.getAccountNumber());
      account1.credit(1000000.99);
      System.out.println(account1.getBalance());
      System.out.println(account1);
      account1.debit(100000000.00);
  }

}
class Account {
  private int accountNumber;
  private double balance;
  public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public Account(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
  public void credit (double amount) {
    this.balance = balance + amount;
  }
  public void debit (double amount) {
    if (balance-amount>=0) {
    this.balance = balance - amount;
    }
    else {
    System.out.println("amount withdrawn exceeds the current balance!");
    }
  }
  public String toString() {
     return "A/C no:"+this.accountNumber+", Balance="+this.balance;
  }
}
