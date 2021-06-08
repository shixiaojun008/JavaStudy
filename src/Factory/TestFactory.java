package Factory;

public class TestFactory {

    public  static  void  main(String[] args){

        String productResult = ProductFactory.createProduct("1");
        System.out.println(productResult);

    }

}
