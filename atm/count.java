public class count {
    private String userName;
    private String password;
    private int balance;

    public count(String userName, String password, int balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public void depositMoney(int amount) {
        balance += amount;
        System.out.println("current balance: " + balance);
    }

    public void withraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("not enough balance");
        } else {
            balance -= amount;
            System.out.println("current balance:" + balance);
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
