import java.util.*;


class Bank{

    String name;
    int accountNumber;
    int amount;

    void deposit(int newAmount){
        amount += newAmount;
    }
    void withdraw(int newAmount){
        if(amount > newAmount)
        amount-=newAmount;
        else
        System.out.println("Insufficient Balance");
    }
    void checkBalance(int accountNumber){
        display();
    }

    void inputInfo(String name, int accountNumber, int amount){
        this.name=name;
        this.accountNumber=accountNumber;
        this.amount=amount;
    }

    void display(){
        System.out.println("Name : " + name + ", Account Number : " + accountNumber + ", Amount : " + amount);
    }

    public static void main(String[] args){
        Bank user = new Bank();
        String name;
        int accountNumber, amount, newAmount=0;

        Scanner sc = new Scanner(System.in);

        
        int ch=1;
        while(ch!=0){


            name = sc.next();
        accountNumber = sc.nextInt();
        amount = sc.nextInt();

        user.inputInfo(name, accountNumber, amount);
        
        System.out.println("Enter amount to withdraw : ");
        newAmount = sc.nextInt();
        user.withdraw(newAmount);

        System.out.println("Enter amount to deposit : ");
        newAmount = sc.nextInt();
        user.deposit(newAmount);

        user.display();
        System.out.println("\n--------------------\n");

            System.out.println("Press 1 to continue, 0 to stop");
            int choice = sc.nextInt();
            if(choice == 0)
            break;

        }

    }

}