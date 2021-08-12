package com.example.demo.design.abstractfactory.factory.impl;

import com.example.demo.design.abstractfactory.factory.DbFactory;
import com.example.demo.design.abstractfactory.inter.DbGet;
import com.example.demo.design.abstractfactory.inter.DbInsert;
import com.example.demo.design.abstractfactory.inter.impl.MysqlGet;
import com.example.demo.design.abstractfactory.inter.impl.MysqlInsert;

/**
 * @author yao
 * @date 2019/12/3
 */
public class MysqlFactory implements DbFactory {
    @Override
    public DbInsert insert() {
        return new MysqlInsert();
    }

    @Override
    public DbGet get() {
        return new MysqlGet();
    }
}
