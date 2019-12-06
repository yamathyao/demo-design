package com.example.demo.design.facade.course;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/6
 */
@Slf4j
public abstract class AbstractCourse {

    public void prepareCourse() {
        log.info("{} ready for class.", name());
    }

    public void proceedCourse() {
        log.info("{} having class now.", name());
    }

    public void stopCourse() {
        log.info("{} finish class.", name());
    }

    public void goToSchool() {
        log.info("{} go to school.", name());
    }

    public void goHome() {
        log.info("{} go home.", name());
    }

    public abstract String name();

    public void action(Actions... actions) {
        for (Actions action : actions) {
            action(action);
        }
    }

    private void action(Actions action) {
        switch (action) {
            case GO_HOME:
                goHome();
                break;
            case GOTO_SCHOOL:
                goToSchool();
                break;
            case PREPARE:
                prepareCourse();
                break;
            case PROCEED:
                proceedCourse();
                break;
            case STOP:
                stopCourse();
                break;
            default:
                break;
        }
    }

    static enum Actions {
        GOTO_SCHOOL, GO_HOME, PREPARE, PROCEED, STOP
    }
}
