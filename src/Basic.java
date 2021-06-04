public class Basic {

    //定义常量  final 表示
    final double PI = 3.1415;

    //定义变量
    String _name = "JERRY";

    Integer _longNum = 22222222;

    Long l = 22222228888888888l;

    Boolean bl = 4 > 5;

    Byte bA = 9;
    Byte bB = 5;
    int iC = bA + bB;    //  Byte iC = bA + bB  就会出现错误， 因为加法运算，程序会自动按照整形进行计算。

    String mark = (50 > 60) ? "及格" : "不及格";

    public void PrintInfo() {
        System.out.println(PI + "\t" + l.toString() + "\t" + mark + "\t" + iC);
    }

    public void PrintSeries() {
        String strOut = "";
        for (int i = 0, j = 15; i < j; i++, j--) {
            strOut += Integer.toString(i) + "$" + Integer.toString(j) + "$";
        }
        System.out.println(strOut);

        // out 标志符号，用来循环中，指示该标识的循环退出
        out:
        for (int x = 0; x < 10; x++) {
            System.out.println("x=" + x);
            for (int y =0; y<10; y++){
                if (y==7){
                    break out;
                }
                System.out.println("y="+y);
            }
        }
    }


}
