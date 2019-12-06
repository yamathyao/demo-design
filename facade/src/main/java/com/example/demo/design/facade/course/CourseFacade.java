package com.example.demo.design.facade.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yao
 * @date 2019/12/6
 */

public class CourseFacade {

    private List<AbstractCourse> courses;

    public CourseFacade() {
        courses = new ArrayList<>();
        courses.add(new Teacher());
        courses.add(new Student());
    }

    public void prepare() {
        for (AbstractCourse course : courses) {
            course.action(AbstractCourse.Actions.GOTO_SCHOOL, AbstractCourse.Actions.PREPARE);
        }
    }

    public void proceed() {
        for (AbstractCourse course : courses) {
            course.action(AbstractCourse.Actions.PROCEED);
        }
    }

    public void stop() {
        for (AbstractCourse course : courses) {
            course.action(AbstractCourse.Actions.STOP, AbstractCourse.Actions.GO_HOME);
        }
    }
}
