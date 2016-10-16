package ggikko.me.practicecoderefactoring.toolbar;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ggikko.me.practicecoderefactoring.R;

/**
 * Created by ggikko on 2016. 10. 16..
 */

@CoordinatorLayout.DefaultBehavior(CustomBehavior.class)
public class CustomToolbar extends RelativeLayout {

    @BindView(R.id.title) TextView title;
    @BindView(R.id.subTitle) TextView subTitle;
    @BindView(R.id.bottomLineView) View bottomLineView;

    public CustomToolbar(Context context) {
        super(context);
        setUp(context, null);
    }

    public CustomToolbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUp(context, attrs);
    }

    private void setUp(Context context, AttributeSet attrs) {
        inflate(context, R.layout.widget_custom_toolbar, this);
        ButterKnife.bind(this);
    }

    public void setCollapsedMode(boolean collapsed) {
        if (collapsed) {
            int subTitleMoveDp = dipToPixel(getContext(), 12f);
            int titleMoveDp = dipToPixel(getContext(), 20);
            startAnimationWithAlphaAndAxisValue(title, 0f, -titleMoveDp);
            startAnimationWithAlphaAndAxisValue(subTitle, 1f ,-subTitleMoveDp);
            bottomLineView.setVisibility(View.GONE);
        } else {
            startAnimationWithAlphaAndAxisValue(title, 1f, 0);
            startAnimationWithAlphaAndAxisValue(subTitle, 1f , 0);
            bottomLineView.setVisibility(View.VISIBLE);
        }
    }

    private void startAnimationWithAlphaAndAxisValue(View view, float alpha, int y){
        view.animate().alpha(alpha).translationY(y).start();
    }

    public static int dipToPixel(Context context, float dip) {
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dip,
                context.getResources().getDisplayMetrics());
    }



}
