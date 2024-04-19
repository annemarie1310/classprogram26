package ToString;

public class MyDate {

    private int day;
    private int month = 2;
    private int year;

    public MyDate(){
        day = 28;
        month = 12;
        year = 2022;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static void swap(MyDate[]dtar) {
        MyDate temp = dtar[0];
        dtar[0] = dtar[1];
        dtar[1] = temp;
    }

    public String toString() {
        return day +" "+ month +" "+year;
    }


    public static void main(String args[]) {
        MyDate dts[] = new MyDate[2];
        dts[0]=new MyDate();
        dts[1]= new MyDate(12,12,2022);

        System.out.println("before swap "+dts[0]+" "+dts[1]);
        MyDate.swap(dts);
        System.out.println("After swap "+dts[0]+" "+dts[1]);


    }

}
