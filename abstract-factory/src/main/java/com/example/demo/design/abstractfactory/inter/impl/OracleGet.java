package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.DbGet;

/**
 * @author yao
 * @date 2019/12/3
 */
public class OracleGet implements DbGet {

    private static final String ORACLE_RESULT = "result from oracle";

    @Override
    public String getRes() {
        return ORACLE_RESULT;
    }
}
