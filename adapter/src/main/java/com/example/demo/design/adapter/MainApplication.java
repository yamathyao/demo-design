package com.example.demo.design.adapter;

import com.example.demo.design.adapter.inter.Ac;
import com.example.demo.design.adapter.inter.DC5Adapter;
import com.example.demo.design.adapter.inter.impl.Ac110;
import com.example.demo.design.adapter.inter.impl.Ac220;
import com.example.demo.design.adapter.inter.impl.ChinaPowerAdapter;
import com.example.demo.design.adapter.inter.impl.JapanPowerAdapter;

import java.util.LinkedList;
import java.util.List;

/**
 * main
 *
 * @author yao
 * @date 2019/12/3
 */
public class MainApplication {

//    public static void main(String[] args) {
//        Driver driver = new Driver(new BusAdapter());
//        driver.drive();
//    }

    private List<DC5Adapter> adapters = new LinkedList<DC5Adapter>();

    public MainApplication() {
        this.adapters.add(new ChinaPowerAdapter());
        this.adapters.add(new JapanPowerAdapter());
    }

    public DC5Adapter getPowerAdapter(Ac ac) {
        DC5Adapter adapter = null;
        for (DC5Adapter ad : this.adapters) {
            if (ad.support(ac)) {
                adapter = ad;
                break;
            }
        }
        return adapter;
    }

    public static void main(String[] args) {
        MainApplication app = new MainApplication();
        Ac chinaAc = new Ac220();
        DC5Adapter adapter = app.getPowerAdapter(chinaAc);
        adapter.outputDC5V(chinaAc);

        Ac japanAc = new Ac110();
        adapter = app.getPowerAdapter(japanAc);
        adapter.outputDC5V(japanAc);
    }
}
