class Account {
    private int accountNo;
    private String name;
    private float amount;

//    method create account
    public void insert(int a, String n, float amt){
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
    }

//    Deposit
    public void deposit(float amt){
        this.amount = this.amount + amt;
        //this.amount += amo;
        //+ this.amount + " from " + this.name
        System.out.println(amt + " deposited");
    }

    // Withdraw method
    public void withdraw(float amt){
        if (this.amount < amt){
            System.out.println("insufficient balance");
        }else{

            this.amount = this.amount - amt;
            //this.amount -= amo;
            System.out.println(amt + " withdrawn");

        }
    }

    // check balance
    public void checkBalance(){
        System.out.println("balance = " + this.amount);
    }

// toString Method
    public String toString() {
        return "Account { "+ "accountNo = " + accountNo + ", " + "name = " + name + ", " + "amount = " + amount + "}";
    }
}