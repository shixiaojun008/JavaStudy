package JDKProxy;

public class TestJdkProxy {

    public static void main(String[] args) {

        JdkProxyExample jdk = new JdkProxyExample();

        MyIntercepter myIntercepter = new MyIntercepter();

        //绑定关系，因为挂在接口 IHelloWorld 下， 所以声明代理对象 HelloWorld proxy
        IHelloWorld proxy = (IHelloWorld) jdk.bind(new HelloWorldImp1(), "JDKProxy.MyIntercepter");

        //注意，此时 HelloWorld对象已经是一个代理对象，它会进入代理的逻辑方法 invoke 里
        proxy.sayHelloWorld();


    }
}
