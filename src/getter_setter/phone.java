package getter_setter;

public class phone {

    String company, model, processor, screen_type;
    float screen_size;
    int battery, camera, price;

    public String getCompany(){
    return company;
    }
    public void setCompany(String company1){
        company=company1;
    }

    public String getmodel(){
        return model;
    }
    public void setmodel(String model1){
        model=model1;
    }

    public String getprocessor(){
        return processor;
    }
    public void setprocessor(String processor1){
        processor=processor1;
    }

    public String getscreen_type(){
        return screen_type;
    }
    public void setscreen_type(String screen_type1){
        screen_type=screen_type1;
    }

    public float getscreen_size(){
        return screen_size;
    }
    public void setscreen_size(float screen_size1){
        screen_size=screen_size1;
    }

    public int getbattery(){
        return battery;
    }
    public void setbattery(int battery1){
        battery=battery1;
    }

    public int getscamera(){
        return camera;
    }
    public void setcamera(int camera1){
        camera=camera1;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int Price1){
        price=Price1;
    }


    public void showphone(){
        System.out.println("company = "+company+"\nModel = "+model+"\nProcessor = "+processor+"\nscreen_type = "+screen_type
                +"\nscreen_size = "+screen_size+"inch" +"\nbattery = "+battery+"Mah"+"\ncamera = "+camera+"MP"+"\nprice = "+price);
    }


    public static void main(String args []){
        phone Apple = new phone();
        Apple.setCompany("Apple");
        Apple.setmodel("Iphone 14");
        Apple.setprocessor("A14 Bionic Chip");
        Apple.setscreen_type("Super Retina XDR");
        Apple.setscreen_size(6.2f);
        Apple.setbattery(4800);
        Apple.setcamera(48);
        Apple.setPrice(75000);

        Apple.showphone();
    }}
