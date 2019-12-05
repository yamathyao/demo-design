package com.example.demo.design.composite.employee;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        Employee ceo = new Employee("John", "CEO", 30000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 16000);

        Employee clerk1 = new Employee("Laura", "Marketing", 12000);
        Employee clerk2 = new Employee("bob", "Marketing", 10000);

        Employee salesClerk1 = new Employee("Richard", "Sales", 8000);
        Employee salesClerk2 = new Employee("Rob", "Sales", 6000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesClerk1);
        headSales.add(salesClerk2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        log.info(ceo.toString());

        for (Employee head : ceo.getSubordinates()) {
            log.info(head.toString());
            for (Employee clerk : head.getSubordinates()) {
                log.info(clerk.toString());
            }
        }

    }
}
