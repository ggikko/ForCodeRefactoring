package ggikko.me.practicecoderefactoring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import ggikko.me.practicecoderefactoring.di.component.DaggerMainComponent;
import ggikko.me.practicecoderefactoring.di.module.MainModule;
import ggikko.me.practicecoderefactoring.presenter.MainPresenter;
import ggikko.me.practicecoderefactoring.presenter.OddPresenter;
import ggikko.me.practicecoderefactoring.presenter.SubPresenter;

public class MainActivity extends AppCompatActivity {

    @Inject MainPresenter mainPresenter;
    @Inject SubPresenter subPresenter;
    @Inject OddPresenter oddPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().mainModule(new MainModule()).build().inject(this);

        mainPresenter.sayMain();
    }
}
