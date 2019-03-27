package factorymethod.factory.impl;

import factorymethod.factory.ICourseFactory;
import simplefactory.course.ICourse;
import simplefactory.course.impl.PythonCourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public class PythonFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
