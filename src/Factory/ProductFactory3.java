package Factory;

public class ProductFactory3 implements IProductFactory{

    @Override
    public String createProduct(String productNo) {

        //工厂3生成产品对象规则，可以是一类产品的规则
        String product = "我这里是生产工厂3号";    //
        return  product;
    }
}
