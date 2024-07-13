class BankAccount{
    String accno;
    double balance;
    double intrest;
    
    public BankAccount(String accno) {
        this.accno = accno;
    }
    public void  deposit(double amount)
    {
        balance=(amount+balance);
    }
}
class SavingAccount extends BankAccount
{
    double minbalance=500;

    public SavingAccount(String accno) {
        super(accno);
    }
    public void widthdraw(double ammount)
    {
        if(balance-ammount>=minbalance)
        {
            System.out.println(balance-ammount); 
        }
        else
        {
            System.out.println("insufficient balance");
        }
        
    }
    
} 

public class Single2 {
    public static void main(String[] args) {
        SavingAccount b=new SavingAccount("101");
        b.deposit(1000);
        b.widthdraw(100);
    }
}
