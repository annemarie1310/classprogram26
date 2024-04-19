package Interface;

interface a{
    void fun1();

}
interface b extends a{
    void fun2();
}
interface c extends a,b{
    void fun3();
}

class Test1 implements a{

    // here if we have only 1 function in ( interface a ) as fun1 so we will have to implement only 1 method .
    @Override
    public void fun1() {

    }
}
class Test2 implements b{
// here if we have 2 functions in ( interface a  as fun1 ) and ( interface b as fun2 )
// so we will have to implement both the  methods cauz b has it own method and b extends a

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }
}

class test3 implements c {
// here if we have 3 functions in ( interface a  as fun1 ) , ( interface b as fun2 ) and ( interface a  as fun3 )
// so we will have to implement all 3  methods cauz c has its own method and c extends a & b.

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void fun3() {

    }
}

public class valid_notValid_interfaces {
}
