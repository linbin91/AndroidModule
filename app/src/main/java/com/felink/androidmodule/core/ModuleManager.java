package com.felink.androidmodule.core;

import android.content.res.Configuration;
import android.util.ArrayMap;

import com.felink.androidmodule.core.ELAbsModule;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ModuleManager {
    public ArrayMap<String,ArrayList<Integer>> modules = new ArrayMap<>();
    public ArrayMap<String,ELAbsModule> allModules = new ArrayMap<>();

    public ELAbsModule getModuleByNames(String name){
        if (!ModuleUtil.empty(name)){
            return allModules.get(name);
        }

        return null;
    }

    public void onResume(){
        for (ELAbsModule module:allModules.values()){
            if (module != null){
                module.onResume();
            }
        }
    }

    public void onPause(){
        for (ELAbsModule module:allModules.values()){
            if (module != null){
                module.onPause();
            }
        }
    }

    public void onStop(){
        for (ELAbsModule module:allModules.values()){
            if (module != null){
                module.onStop();
            }
        }
    }

    public void onConfigurationChanged(Configuration newConfig){
        for (ELAbsModule module:allModules.values()){
            if (module != null){
                module.onOnrientationChanges(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE);
            }
        }
    }

    public void onDestroy(){
        for (ELAbsModule module:allModules.values()){
            if (module != null){
                module.onDestroy();
            }
        }
    }

}
