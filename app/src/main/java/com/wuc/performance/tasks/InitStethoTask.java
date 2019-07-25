package com.wuc.performance.tasks;


import android.os.Handler;
import android.os.Looper;
import com.facebook.stetho.Stetho;
import com.wuc.performance.launcherstarter.task.Task;

/**
 * 异步的Task
 */
public class InitStethoTask extends Task {

    @Override
    public void run() {
        Handler handler = new Handler(Looper.getMainLooper());
        Stetho.initializeWithDefaults(mContext);
    }
}
