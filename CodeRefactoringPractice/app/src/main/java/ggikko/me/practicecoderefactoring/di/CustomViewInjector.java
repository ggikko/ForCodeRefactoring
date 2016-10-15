package ggikko.me.practicecoderefactoring.di;

import android.app.Activity;
import android.view.View;

import ggikko.me.practicecoderefactoring.di.component.MainComponent;
import ggikko.me.practicecoderefactoring.ui.MainActivity;
import ggikko.me.practicecoderefactoring.widget.CustomButton;
import ggikko.me.practicecoderefactoring.widget.CustomImageView;
import ggikko.me.practicecoderefactoring.widget.CustomLinearLayout;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class CustomViewInjector {

    private MainComponent mainComponent;

    public CustomViewInjector(MainComponent mainComponent){
        this.mainComponent = mainComponent;
    }

    public void inject(View... views){
        for(View view : views) {
            if(view instanceof CustomImageView) mainComponent.inject((CustomImageView)view);
            if(view instanceof CustomLinearLayout) mainComponent.inject((CustomLinearLayout)view);
            if(view instanceof CustomButton) mainComponent.inject((CustomButton)view);
        }
    }
}
