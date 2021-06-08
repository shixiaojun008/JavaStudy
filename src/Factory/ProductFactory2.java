package Factory;

public class ProductFactory2 implements IProductFactory{

    @Override
    public String createProduct(String productNo) {

        //工厂2生成产品对象规则，可以是一类产品的规则
        String product = "我这里是生产工厂2号";    //
        return  product;
    }
}
