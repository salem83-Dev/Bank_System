class Account {
private int accountNo;
    private String name;
    private float amount;

//    constructor
    public Account(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }
//    constructor 2
    public Account(int accountNo, String name) {
        this(accountNo, name, 0);
    }
//    constructor 3
    public Account(int accountNo) {
        this(accountNo, "unknown", 0);
    }
//    constructor 4
    public Account() {
        this(100, "unknown", 0);
    }

    public void setAccountNo(int a) {
        this.accountNo = a;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAmount(float amo) {
        this.amount = amo;
    }


    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }
    public float getAmount() {
        return amount;
    }

    //    Deposit
    public void deposit(float amt){
        this.amount = this.amount + amt;
        System.out.println(amt + " deposited");
    }

    // Withdraw method
    public void withdraw(float amt){
        if (this.amount < amt){
            System.out.println("insufficient balance");
        }else{

            this.amount = this.amount - amt;
            System.out.println(amt + " withdrawn");

        }
    }

    // check balance
    public void checkBalance(){
        System.out.println("balance = " + this.amount);
    }

    // toString Method
    public String toString() {
        return "Account no: " + this.accountNo + ", name: " + this.name + ", amount: " + this.amount;
    }
}