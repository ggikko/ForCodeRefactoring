package ggikko.me.practicecoderefactoring.di;

import android.app.Activity;
import android.view.View;

import ggikko.me.practicecoderefactoring.ui.MainActivity;
import ggikko.me.practicecoderefactoring.di.component.MainComponent;
import ggikko.me.practicecoderefactoring.widget.CustomButton;
import ggikko.me.practicecoderefactoring.widget.CustomImageView;
import ggikko.me.practicecoderefactoring.widget.CustomLinearLayout;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class ActivityInjector {

    private MainComponent mainComponent;

    public ActivityInjector(MainComponent mainComponent){
        this.mainComponent = mainComponent;
    }

    public void inject(Activity activity){
        if(activity instanceof  MainActivity) mainComponent.inject((MainActivity)activity);
    }

}
