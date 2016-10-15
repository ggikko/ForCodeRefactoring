package ggikko.me.practicecoderefactoring.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import javax.inject.Inject;

import ggikko.me.practicecoderefactoring.presenter.MainPresenter;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class CustomButton extends Button {

    @Inject MainPresenter mainPresenter;

    public CustomButton(Context context) {
        this(context, null, 0);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void sayIt(){
        mainPresenter.sayMain("CustomButton");
    }
}
