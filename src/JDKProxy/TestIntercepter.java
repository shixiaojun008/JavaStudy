package JDKProxy;

public class TestIntercepter {

    public static void main(String[] args) {

        JdkProxyExample jdk = new JdkProxyExample();

        IHelloWorld proxy1 = (IHelloWorld) jdk.bind(new HelloWorldImp1(), "JDKProxy.Intercepter1");

        IHelloWorld proxy2 = (IHelloWorld) jdk.bind(proxy1, "JDKProxy.Intercepter2");

        IHelloWorld proxy3 = (IHelloWorld) jdk.bind(proxy2, "JDKProxy.Intercepter3");

        // 过滤器3调用
        proxy3.sayHelloWorld();

        System.out.println("*************************************");

        // 过滤器2调用
        proxy2.sayHelloWorld();

        System.out.println("*************************************");

        // 过滤器1调用
        proxy1.sayHelloWorld();

        System.out.println("*************************************");

    }

}
