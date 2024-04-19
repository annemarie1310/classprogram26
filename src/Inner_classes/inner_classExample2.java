package Inner_classes;

public class inner_classExample2 {

    private int num1=58;

    public void ShowOuter(){
        System.out.println("Outer clas value of num1 is : "+num1 );
        class MethodInner // this class is called method inner class .
        {
            int num2 =88;
            public void ShowInnerData(){
                System.out.println("inner class value of num 2 is : "+num2);
            }
        }

        MethodInner m1 =new MethodInner();
        m1.ShowInnerData();
    }

    public static void main(String[] args) {
        inner_classExample2 i1= new inner_classExample2();
        i1.ShowOuter();

    }

}
