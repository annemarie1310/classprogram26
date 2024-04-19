package Interface;

/*
1) Interface is a group of related methods with empty bodies and ( interface with no methods is called marker interface) ..
2) Interface contains only abstract methods with empty bodies & cannot have non-abstract methods with bodies.
3) Methods in the interface is by default abstract .
4) Data members of the interface is public, static , and final.
5) interfaces are immutable ( immutable means non-changeable ).
     INTERFACE VS ABSTRACT
*) We can implement multiple parent interface to a class, but we cannot create a class with multiple parent abstract class .

*/


interface Remote {

    void On();
    void Off();

    default void VolumeUp()
    {
        System.out.println("Increasing volume...");
    }
    //In interface we can write a default method and its body and use it anywhere;  if we override it in another class this method..
    // ... will not work but the overridden method will work.
    // default method is not compulsory to be implemented in below implemented classes .
}

 class TataskyRemote implements Remote{

    @Override
    public void On() {
        System.out.println("Tv is Turned on ...");

    }
    @Override
    public void Off() {
        System.out.println("Tv is Turned Off ...");
    }

    public void ChannelChange(){
        System.out.println("channel has been changed :) ");
    }

    public void VolumeUp()
    {
        System.out.println("Increasing volume..........");
    }
}

class AcRemote implements Remote{

    @Override
    public void On() {
        System.out.println("Ac is Turned On ..");
    }

    @Override
    public void Off() {
        System.out.println("Ac is Turned Off ..");
    }

    public void IncreaseTemp(){
        System.out.println("temperature has been increased .. ");
    }
}


public class demoInterface {
    public static void main(String[] args) {
        TataskyRemote ts1 =new TataskyRemote();
        ts1.On();ts1.ChannelChange();ts1.Off();ts1.VolumeUp();
        System.out.println("\n");
        AcRemote bluestar = new AcRemote();
        bluestar.On();bluestar.IncreaseTemp();bluestar.Off();

        Remote ts2 = new TataskyRemote();  // If we want refrence of interface for the object tataskyremote then
                                            // ( Tataskyremote's own methods will not work for it
                                            //we need to typecast the method as below )
        ts2.On();ts2.VolumeUp();ts2.Off();
        ((TataskyRemote) ts2).ChannelChange(); // type casted as here ..


    }
}
