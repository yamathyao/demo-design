package com.example.demo.design.facade.course;

/**
 * @author yao
 * @date 2019/12/6
 */

public class MainApplication {

    public static void main(String[] args) {
        CourseFacade facade = new CourseFacade();
        facade.prepare();
        facade.proceed();
        facade.stop();
    }
}
