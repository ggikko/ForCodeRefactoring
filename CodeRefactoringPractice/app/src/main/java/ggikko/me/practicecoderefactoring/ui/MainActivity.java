package ggikko.me.practicecoderefactoring.ui;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ggikko.me.practicecoderefactoring.R;
import ggikko.me.practicecoderefactoring.presenter.MainPresenter;
import ggikko.me.practicecoderefactoring.presenter.OddPresenter;
import ggikko.me.practicecoderefactoring.presenter.SubPresenter;
import ggikko.me.practicecoderefactoring.widget.CustomButton;
import ggikko.me.practicecoderefactoring.widget.CustomImageView;
import ggikko.me.practicecoderefactoring.widget.CustomLinearLayout;

public class MainActivity extends BaseActivity {

    @BindView(R.id.customButton) CustomButton customButton;
    @BindView(R.id.customImageView) CustomImageView customImageView;
    @BindView(R.id.customLinearLayout) CustomLinearLayout customLinearLayout;

    @Inject MainPresenter mainPresenter;
    @Inject SubPresenter subPresenter;
    @Inject OddPresenter oddPresenter;

    @OnClick(R.id.customButton)
    void clickCustomButton(){
        customButton.sayIt(); //test
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
    }

    private void setUp() {
        ButterKnife.bind(this); // binding
        injectViews(customButton, customImageView, customLinearLayout); // inject
        setVisible(true, customButton, customImageView, customLinearLayout); //flag에 따라 visibility 설정
    }
}
