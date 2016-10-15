package ggikko.me.practicecoderefactoring.di.module;

import dagger.Module;
import dagger.Provides;
import ggikko.me.practicecoderefactoring.presenter.MainPresenter;
import ggikko.me.practicecoderefactoring.presenter.SubPresenter;

/**
 * Created by ggikko on 2016. 10. 15..
 */

@Module
public class MainModule {

    @Provides
    public MainPresenter provideMainPresenter(){
        return new MainPresenter();
    }
    @Provides
    public SubPresenter provideSubPresenter(){
        return new SubPresenter();
    }
}
