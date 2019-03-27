package simplefactory.course.impl;

import simplefactory.course.ICourse;

public class PythonCourse implements ICourse {
    @Override
    public void learn() {
        System.out.println("学习Python");
    }
}
