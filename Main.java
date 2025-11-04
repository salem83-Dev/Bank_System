import java.util.Scanner;

public class Main{

    public static void main(String[] args){
       Scanner in = new Scanner(System.in);

        Account a1 = new  Account();
        System.out.println("Enter account no: ");
        a1.setAccountNo(in.nextInt());
       // System.out.println(a1.getAccountNo());

        System.out.println("Enter name: ");
        a1.setName(in.next());
      //  System.out.println(a1.getName());

        System.out.println("Enter ammount: ");
        a1.setAmount(in.nextFloat());
       // System.out.println(a1.getAmount());

        System.out.println("===========================");
       System.out.println(a1.toString());
        System.out.println("===========================");

        int choice;
        do{
        System.out.println("which operation you want to perform?");

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. CheckBalance");
        System.out.println("4. Exit");
        choice = in.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter amount to deposit");
                a1.deposit(in.nextFloat());
                a1.checkBalance();
                break;

            case 2:
                System.out.println("Enter amount to withdraw");
                a1.withdraw(in.nextFloat());
                a1.checkBalance();
                break;

            case 3:
                a1.checkBalance();
                break;

            case 4:
                System.out.println("Exited");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        }while(choice != 4 );
    }
}