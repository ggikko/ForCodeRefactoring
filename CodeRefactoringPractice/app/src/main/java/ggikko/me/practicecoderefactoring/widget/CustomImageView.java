package ggikko.me.practicecoderefactoring.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import javax.inject.Inject;

import ggikko.me.practicecoderefactoring.presenter.SubPresenter;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class CustomImageView extends ImageView {

    @Inject SubPresenter subPresenter;

    public CustomImageView(Context context) {
        super(context);
    }

    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
