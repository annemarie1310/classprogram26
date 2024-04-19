package Exception_handelling;

class lowbalance extends Exception{

    public lowbalance(String msg) {
        super(msg);
    }
}
class Account {
    int accountNo;
    String name;
    double balance;

    public Account(){
        accountNo=11554666;name="josh";balance=50000;
    }

    public String toString(){
        return accountNo+" "+name+" "+balance;
    }

    public void withdrawn(double amt)throws lowbalance{
        System.out.println("withdrawal called");
        if (balance-amt<3000){
            throw new lowbalance("Balance is low ");
        }
        balance=balance-amt;

    }
}
public class Custom_exception_handelling {

    public static void main(String[] args) {

        Account a1= new Account();
        System.out.println(a1);
        try{
            a1.withdrawn(60000);
        }
        catch (lowbalance e){
            e.printStackTrace();
        }






    }
}
