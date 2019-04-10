import threadlocal.ThreadLocalSingleton;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-05
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());

        Thread t1=new Thread(new ExecutorThread());
        Thread t2=new Thread(new ExecutorThread());

        t1.start();
        t2.start();
    }
}
