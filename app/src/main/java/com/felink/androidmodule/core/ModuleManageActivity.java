package com.felink.androidmodule.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.ArrayMap;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by Administrator on 2016/12/30.
 */

public abstract class ModuleManageActivity extends AppCompatActivity {

    private ActivityModuleManager moduleManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());

        moduleManager = new ActivityModuleManager();
        moduleManager.initModules(savedInstanceState,this,moduleConfig());
    }

    protected abstract ArrayMap<String,ArrayList<Integer>> moduleConfig();


    public abstract int getContentViewId();


    @Override
    protected void onResume() {
        super.onResume();
        moduleManager.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        moduleManager.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        moduleManager.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
