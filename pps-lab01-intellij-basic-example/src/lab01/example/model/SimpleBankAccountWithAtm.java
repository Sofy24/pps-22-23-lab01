package lab01.example.model;

public class SimpleBankAccountWithAtm implements BankAccount {

    private double balance;
    private final AccountHolder holder;
    private static final int FEE = 1;

    public SimpleBankAccountWithAtm(AccountHolder holder, int balance) {
        this.holder = holder;
        this.balance = balance;
    }

    @Override
    public AccountHolder getHolder() {
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int userID, double amount) {
        if (checkUser(userID)) {
            this.balance += amount;
            this.balance -= SimpleBankAccountWithAtm.FEE;
        }
    }       

    @Override
    public void withdraw(int userID, double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            this.balance -= amount;
            this.balance -= SimpleBankAccountWithAtm.FEE;
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount + this.FEE;
    }

    private boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }

}
