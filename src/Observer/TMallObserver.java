package Observer;

import java.util.Observable;
import java.util.Observer;

public class TMallObserver implements Observer {

    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.out.println("发送新产品" + newProduct + "同步到TMall");
    }
}
