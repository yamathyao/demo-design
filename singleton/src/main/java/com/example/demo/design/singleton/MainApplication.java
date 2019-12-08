package com.example.demo.design.singleton;

import com.example.demo.design.singleton.dcl.DclSingleton;
import com.example.demo.design.singleton.enums.EnumSingleton;
import com.example.demo.design.singleton.holder.HolderSingleton;
import com.example.demo.design.singleton.hungry.HungrySingleton;
import com.example.demo.design.singleton.lazy.NoSafeSingleton;
import com.example.demo.design.singleton.lazy.SafeSingleton;

/**
 * @author yao
 * @date 2019/12/8
 */
public class MainApplication {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();

        DclSingleton dclSingleton = DclSingleton.getInstance();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        HolderSingleton holderSingleton = HolderSingleton.getInstance();
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //  no recommend
        NoSafeSingleton noSafeSingleton = NoSafeSingleton.getInstance();
        SafeSingleton safeSingleton = SafeSingleton.getInstance();

    }
}
