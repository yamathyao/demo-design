package com.example.demo.design.abstractfactory;

import com.example.demo.design.abstractfactory.factory.DbFactory;
import com.example.demo.design.abstractfactory.factory.impl.MysqlFactory;
import com.example.demo.design.abstractfactory.factory.impl.OracleFactory;
import com.example.demo.design.abstractfactory.inter.DbGet;
import com.example.demo.design.abstractfactory.inter.DbInsert;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/3
 */
@Slf4j
public class MainDbApplication {

    @Getter
    @Setter
    private DbInsert dbInsert;

    @Getter
    @Setter
    private DbGet dbGet;

    public void createDb(final DbFactory factory) {
        setDbInsert(factory.insert());
        setDbGet(factory.get());
    }

    public static void main(String[] args) {
        MainDbApplication app = new MainDbApplication();

        app.createDb(new MysqlFactory());
        log.info("create mysql db");
        boolean flag = app.getDbInsert().insertOk();
        String result = app.getDbGet().getRes();
        log.info("Insert mysql {}", flag ? "OK" : "Failed");
        log.info(result);

        app.createDb(new OracleFactory());
        log.info("create oracle db");
        flag = app.getDbInsert().insertOk();
        result = app.getDbGet().getRes();
        log.info("Insert oracle {}", flag ? "OK" : "Failed");
        log.info(result);
    }
}
