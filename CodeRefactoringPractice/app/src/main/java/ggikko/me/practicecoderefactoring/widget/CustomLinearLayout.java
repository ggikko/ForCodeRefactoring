package ggikko.me.practicecoderefactoring.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import javax.inject.Inject;

import ggikko.me.practicecoderefactoring.presenter.OddPresenter;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class CustomLinearLayout extends LinearLayout {

    @Inject OddPresenter oddPresenter;

    public CustomLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLinearLayout(Context context) {
        super(context);
    }
}
