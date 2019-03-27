import abstractfactory.IAbstractCourseFactory;
import abstractfactory.impl.AlibabaCourseFactory;
import abstractfactory.impl.GoogleCourseFactory;
import product.IJavaCourse;
import product.IPythonCourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IAbstractCourseFactory factory=new AlibabaCourseFactory();
        IJavaCourse javaCourse=factory.createJavaCourse();
        IPythonCourse pythonCourse=factory.createPythonCourse();
        javaCourse.learn();
        pythonCourse.learn();
        IAbstractCourseFactory factory2=new GoogleCourseFactory();
        IJavaCourse javaCourse2=factory2.createJavaCourse();
        IPythonCourse pythonCourse2=factory2.createPythonCourse();
        javaCourse2.learn();
        pythonCourse2.learn();
    }
}
