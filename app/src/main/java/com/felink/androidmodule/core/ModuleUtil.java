package com.felink.androidmodule.core;

import java.util.Map;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ModuleUtil {

    public static boolean empty(Map<?,?> c){
        return  (c == null || c.isEmpty());
    }

    public static boolean empty(String s){

        return s == null || s.isEmpty();
    }
}
