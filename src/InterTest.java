
import Interface.ICalculate;

public class InterTest implements ICalculate {

    @Override
    public void Print(String str) {
        System.out.println(str);
    }

    @Override
    public String add(int numA, int numB) {
        return Integer.toString(numA + numB) ;
    }

    @Override
    public String sub(int numA, int numB) {
        return Integer.toString(numA - numB);
    }

    @Override
    public String mul(int numA, int numB) {
        return Integer.toString(numA * numB);
    }

    @Override
    public String div(int numA, int numB) {
        return Integer.toString(numA / numB);
    }

    public static void main(String[] args) {

        InterTest interTest = new InterTest();
        interTest.Print(interTest.add(20,10));
        interTest.Print(interTest.sub(20,10));
        interTest.Print(interTest.mul(20,10));
        interTest.Print(interTest.div(20,10));
    }
}
