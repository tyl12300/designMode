import lazy.LazyInnerClassSingleton;

import java.io.*;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-01
 */
public class SingletonTest {
    public static void main(String[] args) {
//        try {
//            Class clazz= LazyInnerClassSingleton.class;
//
//            Constructor c=clazz.getDeclaredConstructor(null);
//            //强制访问
//            c.setAccessible(true);

//            Object o = LazyInnerClassSingleton.getInstance();
//            System.out.println(o);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
        LazyInnerClassSingleton lazyInnerClassSingleton=null;
        LazyInnerClassSingleton lazyInnerClassSingleton1=LazyInnerClassSingleton.getInstance();
        FileOutputStream fos = null;
        ObjectOutputStream oos=null;
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try {
            fos = new FileOutputStream("LazyInnerClassSingleton.obj");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(lazyInnerClassSingleton1);
            oos.flush();

             fis=new FileInputStream("LazyInnerClassSingleton.obj");
             ois=new ObjectInputStream(fis);
            lazyInnerClassSingleton=(LazyInnerClassSingleton) ois.readObject();
            System.out.println(lazyInnerClassSingleton==lazyInnerClassSingleton1);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
