package ggikko.me.practicecoderefactoring.di.component;

import javax.inject.Singleton;

import dagger.Component;
import ggikko.me.practicecoderefactoring.ui.MainActivity;
import ggikko.me.practicecoderefactoring.di.module.MainModule;
import ggikko.me.practicecoderefactoring.widget.CustomButton;
import ggikko.me.practicecoderefactoring.widget.CustomImageView;
import ggikko.me.practicecoderefactoring.widget.CustomLinearLayout;

/**
 * Created by ggikko on 2016. 10. 15..
 */

@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);

    void inject(CustomImageView customImageView);

    void inject(CustomLinearLayout customLinearLayout);

    void inject(CustomButton customButton);
}
