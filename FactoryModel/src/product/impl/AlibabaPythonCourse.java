package product.impl;

import product.IPythonCourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public class AlibabaPythonCourse implements IPythonCourse {
    @Override
    public void learn() {
        System.out.println("学Python为了去阿里");
    }
}
