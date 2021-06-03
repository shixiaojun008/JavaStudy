// 这是第一个Java练习程序
    /*
        注释块
     */

/**
 *
 * @param args
 */

public class HelloWorld {

    public void PrintMessage(){

        System.out.println("Hello World!");                 //打印一个打招呼的字符串

        String day = "3";
        String weekday ="";
        switch (day){
            case "1":
                weekday = "MONDAY";
                break;
            case "2":
                weekday = "TUESDAY";
                break;
            case "3":
                weekday = "WEDNESDAY";
                break;
            case "4":
                weekday = "THURSDAY";
                break;
            case "5":
                weekday = "FRIDAY";
                break;
            case "6":
                weekday = "SATDAY";
                break;
            case "7":
                weekday = "SUNDAY";
                break;
            default:
                weekday = "NULL";
                break;
        }

        System.out.println(String.format("Today is %s", weekday));

    }


/**
 *
 * %s	字符串类型	“你好啊伙计”
 * %c	字符类型	‘m’
 * %b	布尔类型	true
 * %d	整数类型	（十进制） 88
 * %x	整数类型	（十六进制） FF
 * %o	整数类型	（八进制） 77
 * %f	浮点类型	8.888
 * %a	十六进制浮点类型	FF.35AE
 * %e	指数类型	9.38e+5
 * %g	通用浮点类型（f和e类型中较短的）	不举例(基本用不到)
 * %h	散列码	不举例(基本用不到)
 * %%	百分比类型	％(%特殊字符%%才能显示%)
 * %n	换行符	不举例(基本用不到)
 * %tx	日期与时间类型（x代表不同的日期与时间转换符)	不举例(基本用不到)
 *
 */



}
