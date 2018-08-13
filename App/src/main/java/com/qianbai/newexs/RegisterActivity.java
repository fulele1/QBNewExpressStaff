package com.qianbai.newexs;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.qianbai.newexs.utils.StatuBarUtil;

@Route(path="/qb/registerActivity")
public class RegisterActivity extends BaseActivity {

    private RegisterActivity instance;
    private TextView txt_back;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        instance = this;
        StatuBarUtil.translucentStatusBar(this,true);
        initView();
    }

    private void initView() {
        txt_back = findViewById(R.id.txt_back_reg);
        txt_back.setOnClickListener(instance);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txt_back_reg:
                ARouter.getInstance()
                        .build("/qb/loginActivity")
                        .withOptionsCompat(ActivityOptionsCompat.
                                makeScaleUpAnimation(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0))//动画效果
                        .navigation();
                break;
        }
    }
}

