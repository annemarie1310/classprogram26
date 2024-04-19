package Inner_classes;

// class OuterDemoStaticInner{
//
//    private int num1=55;
//    static int num2=85;
//
//    public void ShowOuter(){
//        System.out.println("value of num1 is "+num1+"value of static num2 is  : - " +num2 );
//    }
//static class StaticInnerDemo {
//        int num3 =88;static int num4=65;
//        public void showInner(){
//            System.out.println("static num2 is  "+num1);
//            System.out.println("static num2 is  "+num2);
//            System.out.println("value of inner num 3 is "+num3);
//            System.out.println("value of inner num 3 is "+num4);
//        }
//    }
//
//
//

 class InnerClass {

     private int num1=55;
     static int num2=85;

     public void ShowOuter(){
         System.out.println("value of num1 is "+num1+"value of static num2 is  : - " +num2 );
     }
     static class StaticInnerDemo {
         int num3 =88;static int num4=65;
         public void showInner(){
             System.out.println("static num2 is  "+num2);
             System.out.println("value of inner num 3 is "+num3);
             System.out.println("value of inner num 3 is "+num4);
         }
     }


     public static void main(String[] args) {
         InnerClass i1 = new InnerClass();
         i1.ShowOuter();

         StaticInnerDemo a= new StaticInnerDemo();
         a.showInner();

     }
}
