package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.DbGet;

/**
 *
 * @author GEEX177
 * @date 2019/12/3
 */
public class MysqlGet implements DbGet {

    static final String MYSQL_RESULT = "result from mysql";

    @Override
    public String getRes() {
        return MYSQL_RESULT;
    }
}
