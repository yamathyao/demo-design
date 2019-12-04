package com.example.demo.design.abstractfactory.factory.impl;

import com.example.demo.design.abstractfactory.factory.DbFactory;
import com.example.demo.design.abstractfactory.inter.DbGet;
import com.example.demo.design.abstractfactory.inter.DbInsert;
import com.example.demo.design.abstractfactory.inter.impl.OracleGet;
import com.example.demo.design.abstractfactory.inter.impl.OracleInsert;

/**
 * @author GEEX177
 * @date 2019/12/3
 */
public class OracleFactory implements DbFactory {
    @Override
    public DbInsert insert() {
        return new OracleInsert();
    }

    @Override
    public DbGet get() {
        return new OracleGet();
    }
}
