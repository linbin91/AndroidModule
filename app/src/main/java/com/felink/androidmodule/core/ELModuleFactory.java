package com.felink.androidmodule.core;

import android.text.NoCopySpan;
import android.text.TextUtils;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ELModuleFactory {
    public static ELAbsModule newModuleInstance(String name) {
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        try {
            Class<? extends ELAbsModule> moduleClazz = (Class<? extends ELAbsModule>) Class.forName(name);
            if (moduleClazz != null) {
                ELAbsModule instance = moduleClazz.newInstance();
                return instance;
            }
            return  null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
