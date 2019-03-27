import simplefactory.CourseFactory;
import simplefactory.course.ICourse;
import simplefactory.course.impl.JavaCourse;
import simplefactory.course.impl.PythonCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory=new CourseFactory();
        ICourse course=factory.createCourse(JavaCourse.class);
        ICourse course2=factory.createCourse(PythonCourse.class);
        course.learn();
        course2.learn();
    }
}
