package com.example.demo.design.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/4
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        Person personWang = new Builder.Properties().name("Wang").age(21).nationality(Nationality.CHINA).skinColor(SkinColor.YELLOW).build();

        Person personJack = new Builder.Properties().name("Jack").age(65).nationality(Nationality.USA).skinColor(SkinColor.BLACK).build();

        Person personRusa = new Builder.Properties().name("Rusa").age(22).nationality(Nationality.RUSSIA).skinColor(SkinColor.WHITE).build();

        log.info(personWang.toString());
        log.info(personJack.toString());
        log.info(personRusa.toString());
    }
}
