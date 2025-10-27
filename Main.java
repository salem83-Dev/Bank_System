import java.util.Scanner;

public class Main{

    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

        Account a1 = new Account();
        a1.insert(4451238,"Mohammed",10000);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.checkBalance();
        a1.toString();

        System.out.println("================");
        Account a2 = new Account();
        a2.insert(9563145,"Belal",100);
        a2.deposit(50);
        a2.withdraw(140);
        a2.checkBalance();
        a2.toString();

        System.out.println("================");
        Account a3 = new Account();
        a3.insert(4451238,"Ahmed",5000);
        a3.deposit(500);
        a3.withdraw(10);
        a3.checkBalance();
        a3.toString();

    }
}