package Inheritece;

// below are 4 types of inheritance .
// 1) Single level inheritance. where there is  (1 base class ,1 derived class )
// 2) Multi level inheritance . where there is (1 base class,two derived class) data of base class to 1st derived class ,1st derived class to 2nd derived class data is copied.
// 3) Hierarchical inheritance. where there is (1 base class,two derived class) data of same base class to multiple derived class.
// 4) Hybrid inheritance . where mix of Single level inheritance ,Multi level inheritance,Hierarchical inheritance
// 5) multilevel is not possible in java i.e = 1 derived class is extended to 2 base class .


class  Car{

    String Maker, Type, color, ModelName;
    int Seats, Manufacturing_Date, engine_cc;
    boolean TouchScreen;

/*
    public void getdate(int a){
    Manufacturing_Date=a;

    public void printdate(){
        System.out.println();
    }
*/


    public void Print_car_details(){

        System.out.println("car manufacturer ="+Maker+"\n"+"Model ="+ModelName+"\n"+"Seater ="+Seats+"\n"+"Type ="+Type
                +"\n"+"Engine capacity ="+engine_cc+"\n"+"Color ="+color+"\n"+"Manufacturing Date ="+Manufacturing_Date+"\n"+"Touch screen ="+TouchScreen);
    }

}

class Trucks extends Car {

String Wheels;
float Meilage;
int Gears;
String SleepingBed;


public void print_truck_details(){
    System.out.println("\n\nTruck manufacturer ="+Maker+"\n"+"Model ="+ModelName+"\n"+"Seater ="+Seats+"\n"+"Type ="+Type
            +"\n"+"Engine capacity ="+engine_cc+"\n"+"Wheels = "+Wheels+"\n"+"Meilage = "+Meilage+"\n"+"Gears = "+Gears+"\n"+"SleepingBed ="+SleepingBed);
}

}

public class Automobiles {

public static void main(String args [])
{
    Car Tigor = new Car();
    Tigor.Maker="Tata"; Tigor.ModelName="Tigor";  Tigor.Seats=4; Tigor.Type="Petrol"; Tigor.engine_cc=1200; Tigor.color="Red";
    Tigor.Manufacturing_Date=22_12_2022; Tigor.TouchScreen=false; Tigor.Print_car_details();

    Car Nexon = new Car();
    Nexon.Maker="Tata";
    Nexon.ModelName="Nexon";
    Nexon.Seats=4;
    Nexon.Type="Petrol";
    Nexon.engine_cc=1200; Nexon.color="Grey"; Nexon.Manufacturing_Date=5_5_2020; Nexon.TouchScreen=true;
    Nexon.Print_car_details();

    Trucks volvo_b440=new Trucks();
    volvo_b440.Maker="Tata";
    volvo_b440.ModelName="Nexon";
    volvo_b440.Seats=4;
    volvo_b440.Type="Petrol";
    volvo_b440.engine_cc=5000; volvo_b440.color="Grey"; volvo_b440.SleepingBed="yes";
    volvo_b440.print_truck_details();

}
}
