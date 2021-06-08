package JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {

    private Object target = null;                  // 真实对象
    private String interceptorClass = null;        // 拦截器全限定名

    public JdkProxyExample() {
    }

    public JdkProxyExample(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    /*
            建立代理对象和真实对象的代理关系，并返回代理对象
            @param      target      真实对象
            @return                 代理对象
         */
    public Object bind(Object target, String interceptorClass) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new JdkProxyExample(target, interceptorClass));
    }

    /*
        代理方法逻辑
        @param      proxy       代理对象
        @param      method      当前调度方法
        @param      args        当前方法参数
        @return                 代理返回结果
        @throws     Throwable   异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        if (interceptorClass == null) {
            System.out.println("进入代理逻辑方法");
            System.out.println("在调度真实对象之前的服务");
            obj = method.invoke(target, args);
            System.out.println("在调度真实对象之后的服务");
        }

        //通过反射生成拦截器
        Intercepter intercepter = (Intercepter) Class.forName(interceptorClass).newInstance();

        //调用前置方法
        if (intercepter.before(proxy, target, method, args)) {
            obj = method.invoke(target, args);
        } else {
            intercepter.around(proxy, target, method, args);
        }

        //调用后置方法
        intercepter.after(proxy, target, method, args);

        return obj;
    }
}
