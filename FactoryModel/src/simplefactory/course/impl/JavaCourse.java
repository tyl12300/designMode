package simplefactory.course.impl;

import simplefactory.course.ICourse;

public class JavaCourse implements ICourse {
    @Override
    public void learn() {
        System.out.println("学习java");
    }
}
