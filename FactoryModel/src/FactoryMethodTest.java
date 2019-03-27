import factorymethod.factory.ICourseFactory;
import factorymethod.factory.impl.JavaFactory;
import factorymethod.factory.impl.PythonFactory;
import simplefactory.course.ICourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaFactory();
        ICourse course = factory.create();
        course.learn();
        ICourseFactory factory2 = new PythonFactory();
        ICourse course2 = factory.create();
        course.learn();
        course2.learn();
    }
}
