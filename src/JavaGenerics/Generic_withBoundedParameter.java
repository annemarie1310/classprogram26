package JavaGenerics;


class Emp<t>{

}
class Salesmanager extends Emp{

}
class Projectmanager extends Emp{

}
class Animal {

}
class Lion {

}

//                          BOUNDED PARAMETER  . bounded with class so other class object can't be created .
public class Generic_withBoundedParameter<t extends Emp>   // so here the class extends only with employee so objects of Animal and Lion can't be created .
{
    public static void main(String[] args) {

   Generic_withBoundedParameter<Emp> e1 = new Generic_withBoundedParameter<>();
   Generic_withBoundedParameter<Salesmanager> s1 = new Generic_withBoundedParameter<>();
   Generic_withBoundedParameter<Projectmanager> p1 = new Generic_withBoundedParameter<>();
 //  Generic_withBoundedParameter<Animal> a1 = new Generic_withBoundedParameter<>();  // this cannot be created .
// Generic_withBoundedParameter<Lion> l1 = new Generic_withBoundedParameter<>();      // this cannot be created .



    }
}
