package CGLIBProxy;

public class testCGLIBProxy {

    public static void main(String[] args) {

        CglibProxyExample cpe = new CglibProxyExample();

        ReflectServiceImp1 obj = (ReflectServiceImp1)cpe.getProxy(ReflectServiceImp1.class);

        obj.sayHello("Jerry");

    }

}
