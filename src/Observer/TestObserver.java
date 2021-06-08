package Observer;

public class TestObserver {

    public static void main(String[] args) {

        ProductList observable = ProductList.getInstance();

        JDObserver jdObserver = new JDObserver();

        TMallObserver tMallObserver  = new TMallObserver();

        observable.addObserver(jdObserver);
        observable.addObserver(tMallObserver);

        for(int i=1; i<3; i++){
            observable.addProduct("新增产品" + Integer.toString(i) );
        }
    }
}
