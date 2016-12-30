package com.felink.androidmodule.core;

import android.os.Bundle;

/**
 * Created by Administrator on 2016/12/30.
 */

public abstract class ELAbsModule {
    public abstract void init(ELModuleContext moduleContext, String extend);
    public abstract void onSaveInstanceState(Bundle outState);
    public abstract void onResume();
    public abstract void onPause();
    public abstract void onStop();
    public abstract void onOnrientationChanges(boolean isLandscape);
    public abstract void onDestroy();

}
