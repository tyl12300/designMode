package abstractfactory.impl;

import abstractfactory.IAbstractCourseFactory;
import product.IJavaCourse;
import product.IPythonCourse;
import product.impl.AlibabaJavaCourse;
import product.impl.AlibabaPythonCourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public class AlibabaCourseFactory implements IAbstractCourseFactory {

    @Override
    public IJavaCourse createJavaCourse() {
        return new AlibabaJavaCourse();
    }

    @Override
    public IPythonCourse createPythonCourse() {
        return new AlibabaPythonCourse();
    }
}
