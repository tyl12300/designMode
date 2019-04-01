import register.EnumSingleton;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-01
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton enumSingleton=EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2=EnumSingleton.getInstance();
        System.out.println(enumSingleton==enumSingleton2);
    }
}
