package abstractfactory.impl;

import abstractfactory.IAbstractCourseFactory;
import product.IJavaCourse;
import product.IPythonCourse;
import product.impl.GoogleJavaCourse;
import product.impl.GooglePythonCourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public class GoogleCourseFactory implements IAbstractCourseFactory {

    @Override
    public IJavaCourse createJavaCourse() {
        return new GoogleJavaCourse();
    }

    @Override
    public IPythonCourse createPythonCourse() {
        return new GooglePythonCourse();
    }
}
