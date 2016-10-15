package ggikko.me.practicecoderefactoring.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ggikko.me.practicecoderefactoring.di.ActivityInjector;
import ggikko.me.practicecoderefactoring.di.CustomViewInjector;
import ggikko.me.practicecoderefactoring.di.component.DaggerMainComponent;
import ggikko.me.practicecoderefactoring.di.component.MainComponent;
import ggikko.me.practicecoderefactoring.di.module.MainModule;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class BaseActivity extends AppCompatActivity {

    private MainComponent mainComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buildComponent();

        injectActivity();
    }

    private void buildComponent() {
        mainComponent = DaggerMainComponent.builder().mainModule(new MainModule()).build();
    }

    //activity inject
    private void injectActivity() {
        ActivityInjector injector = new ActivityInjector(mainComponent);
        injector.inject(this);
    }

    //custom view inject
    protected void injectViews(View... views) {
        CustomViewInjector customViewInjector = new CustomViewInjector(mainComponent);
        customViewInjector.inject(views);
    }

    //이것을 사용해도 되고
    protected void setVisible(boolean isVisible, View... views) {
        if (isVisible) {
            for (View view : views) view.setVisibility(View.VISIBLE);
        } else {
            for (View view : views) view.setVisibility(View.GONE);
        }
    }

    //명시적으로 2개를 나눠도 좋고
    protected void setVisibilityVisible(View... views) {
        for (View view : views) view.setVisibility(View.VISIBLE);
    }

    protected void setVisibilityGone(View... views) {
        for (View view : views) view.setVisibility(View.GONE);
    }


}
