package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.DbInsert;

/**
 * @author yao
 * @date 2019/12/3
 */
public class OracleInsert implements DbInsert {

    private static final boolean ORACLE_INSERT_OK = true;

    @Override
    public boolean insertOk() {
        return ORACLE_INSERT_OK;
    }
}
