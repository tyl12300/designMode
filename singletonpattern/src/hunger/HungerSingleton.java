package hunger;

/**
 * @Author tyl
 * @Date 2019-04-01
 */
public class HungerSingleton {
    private HungerSingleton(){}//私有默认构造方法
    private static final HungerSingleton hungerSingleton = new HungerSingleton();
  /**
   *  对外开放获取实体类方法
   *
   * @Param []
   * @return hunger.HungerSingleton
   **/
    public static HungerSingleton getInstance(){
        return hungerSingleton;
    }
}
