package lazysingleton;


import java.io.Serializable;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-01
 */
public class LazyInnerClassSingleton implements Serializable {
    private LazyInnerClassSingleton(){
        //防止反射创建对象
        if(InnerClass.lazyInnerClassSingleton!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    static class InnerClass{
        static final LazyInnerClassSingleton lazyInnerClassSingleton=new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance(){
        return InnerClass.lazyInnerClassSingleton;
    }
    //防止被序列化后产生多个单例
    private Object readResolve(){
        return InnerClass.lazyInnerClassSingleton;
    }
}
