package product.impl;

import brand.IAalibaba;
import product.IJavaCourse;
import product.IPythonCourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public class GooglePythonCourse implements IPythonCourse {
    @Override
    public void learn() {
        System.out.println("学Python为了去谷歌");
    }
}
