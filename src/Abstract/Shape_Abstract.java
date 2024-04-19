package Abstract;

abstract class shape {

    abstract void draw ();
    abstract void fillColor();

}

class circle extends shape{

    double r=4;
    double pi=3.14;
    @Override
    void draw() {
        System.out.println("drawing circle ...");
        System.out.println("area of circle is : "+pi*r*r);
    }

    @Override
    void fillColor() {
        System.out.println("filling the circle with color red .. "+"\n");
    }
}


class rectangle extends shape{


    double length;
    double height=length=2.5;

    @Override
    void draw() {
        System.out.println("drawing rectangle ...");
        System.out.println("area of rec is  : "+length*height);
    }

    @Override
    void fillColor() {
        System.out.println("filling the rectangle with color yellow .. ");
    }


}

public class Shape_Abstract {

    public static void main(String[] args) {

        circle c1= new circle();
        c1.draw();c1.fillColor();

        rectangle r1 =new rectangle();
        r1.draw();r1.fillColor();


    }


}
