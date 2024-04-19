package getter_setter;

class Account{

    private int account_no;
    private String owner_name;
    private double balance;


    public int getaccount_no(){
        return account_no;
    }
    public void setaccount_no(int acnum)    {
        account_no =acnum;
    }

    public String getowner_name(){
        return owner_name;
    }
    public void setowner_name(String name){
        owner_name =name;
    }

    public double getabalance(){
        return balance;
    }
    public void setbalance(int bal){
        balance =bal;
    }



}


public class BankAccount {
    public static void main(String args []){

        Account b1=new Account();
        b1.setaccount_no(5520);
        b1.setowner_name("pranay k");
        b1.setbalance(50000);   // initial balance.
        b1.setbalance(100000);  // updated balance.
        System.out.println("Account no = "+b1.getaccount_no());
        System.out.println("Owner Name = "+b1.getowner_name());
        System.out.println("Account Balance = "+b1.getabalance());



    }


}
