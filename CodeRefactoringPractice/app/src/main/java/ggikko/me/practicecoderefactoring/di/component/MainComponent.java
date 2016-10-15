package ggikko.me.practicecoderefactoring.di.component;

import javax.inject.Singleton;

import dagger.Component;
import ggikko.me.practicecoderefactoring.MainActivity;
import ggikko.me.practicecoderefactoring.di.module.MainModule;

/**
 * Created by ggikko on 2016. 10. 15..
 */

@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
