package bankFunction;

public class bankFunction {
    private String name;
    private int accNumber;
    private int balance;

    public bankFunction(String name, int accNumber, int balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    public String toString()
    {
        return " name:"+ name + "  "+"Balance:"+balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void Sdeposit(int amount) {
        balance += amount;
    }

    public void Swithdraw(int amount) {
        balance -= amount;
    }
}
