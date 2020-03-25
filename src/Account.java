public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void debit(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Please add more money.");
        } else {
            balance -= amount;
        }
    }

    public void transferTo(Account account, int amount) {
        if (amount < this.balance) {
            System.out.println("Insufficient balance! Can't transfer!");
        } else {
            account.credit(amount);
            this.balance -= amount;
        }
    }
}
