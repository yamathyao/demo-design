package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.DbInsert;

/**
 * @author yao
 * @date 2019/12/3
 */
public class MysqlInsert implements DbInsert {

    private static final boolean MYSQL_INSERT_OK = true;

    @Override
    public boolean insertOk() {
        return MYSQL_INSERT_OK;
    }
}
