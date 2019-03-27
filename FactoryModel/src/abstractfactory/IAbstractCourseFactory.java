package abstractfactory;

import brand.IAalibaba;
import brand.IGoogle;
import product.IJavaCourse;
import product.IPythonCourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public interface IAbstractCourseFactory  {
    IJavaCourse createJavaCourse ();
    IPythonCourse createPythonCourse ();
}
