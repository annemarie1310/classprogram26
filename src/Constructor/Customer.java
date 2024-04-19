package Constructor;

public class Customer {

    String name, Address, email_Id, card_type, plan;
    int connections;
    long phone;
    double bill_amt;

    //copy constructor variable.  for customer 2 and customer 3.
    String a;
    double b;

    //end of copy constructor

    // below for 2nd constructor
    String service_Provider;
    int Customer_since;

    // below  for fiber ; for 3rd constructor.
    int billl_amt;
    boolean fiber_connection;

    public Customer()            // initiate info using constructor
    {
        name="Hellen Keller";
        Address="India, pune, sinhagad road, Scraper tower3, 6th floor ,ft_no-601.";
        email_Id="hellen123@gmail.com";
        card_type="postpaid";
        plan="family 1200f22";
        connections=4;
        phone=9873556872l;
        bill_amt=1200;
        System.out.println("\nCustomer 1 Name  = "+name+"\nAddress = "+Address+"\nEmail ID = "+email_Id+"\nCard Type = "+card_type
                +"\nPlan Type = "+plan+"\nNo.of Connections = "+connections+"\nPhone no = "+phone+"\nBill Amt = "+bill_amt);
    }
    public Customer(String service_provider,int Customer_since1){
        service_Provider=service_provider;
        Customer_since=Customer_since1;
        System.out.println("Servie provider = "+service_provider+"\nCustomer Since = "+Customer_since1+"years");
    }

    public Customer (boolean fiber_connection1,String Plan_type,int billl_amt1){
        fiber_connection=fiber_connection1;
        billl_amt=billl_amt1;
        System.out.println("fiber connection Yes-true / no-false = "+fiber_connection1+"\nPlan type = "+Plan_type
                +"\nBill Amt = "+billl_amt1);
    }
    public Customer(String name2,long phone2,String card_type2,double bill_amt2){
        name2=name2;
        phone2=phone2;
        a=card_type2;
        b=bill_amt2;
        System.out.println("\n\nCustomer 2 Name = "+name2+"\nPhone no = "+phone2+"\nCard type = "+a+"\nBill Amt = "+b);

    }

    // below for copy constructor .
    public Customer(Customer c2) {
        name="Anne marie";
        phone=776784325;
        a=c2.a;  // this data is being copied from customer 2 .
        b=c2.b;   // this data is being copied from customer 2 .
        System.out.println("\n\ncustomer 3 Name = "+name+"\nPhone no = "+phone+"\nPlan = "+a+"\nBill Amt = "+b);
    }
    // above end for copy constructor

    public static void main(String args []){

//    new Customer();          // calling constructor without creating object .

        Customer c1 =new Customer(); // here constructor was called while creating object.// constructor calling with no parameter.

        new Customer("Airtel",5);  // constructor 2 with parameter.

        new Customer(true,"fiber f0550",550); // constructor 3 with parameter.

        Customer c2=new Customer("josh gates",878562532,"prepaid",350);

        Customer c3=new Customer(c2);  //for copy constructor /data copied of customer 2 in customer 3 .

    }}
