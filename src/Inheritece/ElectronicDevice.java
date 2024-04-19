package Inheritece;

// multiLevel inheritance.
class ElectronicDevice {

public String printE(){
    return "hello i am a electronic device";
}
}
class Computer extends ElectronicDevice {

    public String printc(){
        return super.printE()+" ,"+ "hello i am a Computer";
    }

}
class Tv extends ElectronicDevice{

    public String printt(){
        return super.printE()+" ,"+"hello i am a TV ";
    }
}
class MobilePhone extends ElectronicDevice{
    public String print(){
        return super.printE()+" ,"+"hello i am a Phone ";
    }
}

class LCDtV extends Tv{

    public String printLC() {
        return super.printE()+" ,"+"hello i am a LCD tv ";
    }
}
class LEDtV extends Tv{

    public String printLE(){
        return super.printE()+" ,"+"hello i am a LED tv ";
    }
}

class Test{
    public static void main(String args []){
        ElectronicDevice e1 = new ElectronicDevice();
        System.out.println(e1.printE());
        Computer c1 = new Computer();
        System.out.println(c1.printc());


    }

}