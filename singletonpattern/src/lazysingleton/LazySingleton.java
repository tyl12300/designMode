package lazysingleton;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-01
 */
public class LazySingleton {
    private LazySingleton(){};

    private static LazySingleton lazySingleton;

    //问题 线程不安全 多线程同时进入 可能产生多个对象
    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton =new LazySingleton();
        }
        return lazySingleton;
    }
    //问题 方法级锁 解决线程不安全，但效率低
    public static synchronized LazySingleton getInstance2(){
        if(lazySingleton==null){
            lazySingleton =new LazySingleton();
        }
        return lazySingleton;
    }
    //doubleCheck
    public static  LazySingleton getInstance3(){
        if(lazySingleton==null){
            synchronized (LazySingleton.class) {
                if(lazySingleton==null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
