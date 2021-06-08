package Factory;

public class ProductFactory {

    public static String createProduct(String productNo) {

        String iProduct = "";
        switch (productNo) {
            case "1":
            case "2":
                iProduct = new ProductFactory1().createProduct(productNo);
                break;
            case "3":
                iProduct = new ProductFactory2().createProduct(productNo);
                break;
            case "4":
            case "5":
                iProduct = new ProductFactory3().createProduct(productNo);
                break;
        }
        return iProduct;
    }

}
