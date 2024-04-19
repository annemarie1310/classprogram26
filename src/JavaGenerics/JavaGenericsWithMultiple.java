package JavaGenerics;

class Generics <t1,t2>{

    t1 a ;
    t2 b;

    public Generics(t1 x , t2 y){
        a=x;
        b=y;
    }

    public t1 getA() {
        return a;
    }

    public void setA(t1 a) {
        this.a = a;
    }

    public t2 getB() {
        return b;
    }

    public void setB(t2 b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Generics{" + "a=" + a + ", b=" + b + '}';
    }

}


public class JavaGenericsWithMultiple {
    public static void main(String[] args) {

        Generics <Integer,Integer> g1= new Generics<>(12,50);
        Generics <String,Integer> g2= new Generics<>("Hello",50);
        Generics <Integer,Float> g3= new Generics<>(12,99.9f);

        System.out.println(g1 +"\n"+g2 +"\n"+g3);

        System.out.println(g1.a);
        System.out.println(g3.b);

    }
}
