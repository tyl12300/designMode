package register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-01
 */
public class ContainerSingleton {
    //这个是容器
    private ContainerSingleton(){}

    private static final Map<String,Object> ioc=new ConcurrentHashMap<>();
    //对外获取 实例的方法
    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj=null;
                try {
                    obj=Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ioc.get(className);
        }

    }
}
