import java.util.Random;
import java.util.Arrays;

public class Array {

    //test git update..TTT
    public void GetArrayL1() {
        int sum = 0;
        Random rand = new Random();

        int[] iArray = new int[rand.nextInt(5)];    //随机生成 0-9 之间的数作为数组的长度
        int[] cArray = new int[iArray.length];

        String[] books = {"Java", "C", "Python"};

//        int[] iArray = new int[10];
        for (int i = iArray.length; i > 0; i--) {
            iArray[i - 1] = rand.nextInt(10);       //随机生成 0-19 之间的数作为数组的值
        }

        System.arraycopy(iArray, 0, cArray, 0, iArray.length);

        Arrays.sort(iArray);
        Arrays.sort(cArray);

        for (int i = 0; i < iArray.length; i++) {
            sum += iArray[i];
            System.out.print(iArray[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < cArray.length; i++) {
            System.out.print(cArray[i] + "\t");
        }

        System.out.println("\n" + sum);

        for (String book : books) {
            System.out.print(book + "\t");
        }
        System.out.println();

    }

    public void GetArrayL2() {
        int iiArray[][] = {{1, 3, 5, 7}, {2, 4, 6, 8}};
        for (int i = 0; i < iiArray.length; i++) {
            for (int j = 0; j < iiArray[i].length; j++) {
                System.out.print(iiArray[i][j] + "\t");
            }
        }
    }


}
