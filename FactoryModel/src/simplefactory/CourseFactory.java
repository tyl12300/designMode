package simplefactory;

import simplefactory.course.ICourse;

public class CourseFactory {
    private ICourse course;
//    public ICourse createCourse(String courseName){
//        courseName=courseName.toUpperCase();
//        if("JAVA".equals(courseName)){
//            course= new JavaCourse();
//        }else if("PYTHON".equals(courseName)){
//            course=new PythonCourse();
//        }
//        return course;
//    }
        public ICourse createCourse(Class clazz){
        if(clazz!=null){
            try {
                course= (ICourse) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return course;
    }
}
