package product.impl;

import product.IJavaCourse;

/**
 * @Author tyl
 * @Date 2019-03-27
 */
public class GoogleJavaCourse implements IJavaCourse {
    @Override
    public void learn() {
        System.out.println("学Java为了去谷歌");
    }
}
