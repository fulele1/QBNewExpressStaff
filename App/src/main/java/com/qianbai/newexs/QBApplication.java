package com.qianbai.newexs;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.qianbai.qb_core.QBProject;
import com.qianbai.qb_ec.FontEcModule;


/**
 * Created by fule on 2018/6/26.
 */

public class QBApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        QBProject.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
