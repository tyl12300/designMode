import threadlocal.ThreadLocalSingleton;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-05
 */
public class ExecutorThread implements Runnable{

    @Override
    public void run() {
        ThreadLocalSingleton threadLocalSingleton=ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+threadLocalSingleton);
        System.out.println(Thread.currentThread().getName()+":"+threadLocalSingleton);
        System.out.println(Thread.currentThread().getName()+":"+threadLocalSingleton);
        System.out.println(Thread.currentThread().getName()+":"+threadLocalSingleton);
        System.out.println(Thread.currentThread().getName()+":"+threadLocalSingleton);
        System.out.println(Thread.currentThread().getName()+":"+threadLocalSingleton);
    }
}
