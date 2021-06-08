package Factory;

public class ProductFactory1 implements IProductFactory{

    @Override
    public String createProduct(String productNo) {

        //工厂1生成产品对象规则，可以是一类产品的规则
        String product = "我这里是生产工厂1号";    //
        return  product;
    }
}
