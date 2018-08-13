package com.qianbai.newexs;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
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

        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init( this);
    }

}
