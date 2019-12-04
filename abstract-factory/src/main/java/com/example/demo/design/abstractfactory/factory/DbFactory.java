package com.example.demo.design.abstractfactory.factory;

import com.example.demo.design.abstractfactory.inter.DbGet;
import com.example.demo.design.abstractfactory.inter.DbInsert;

/**
 * @author GEEX177
 * @date 2019/12/3
 */
public interface DbFactory {

    DbInsert insert();

    DbGet get();
}
