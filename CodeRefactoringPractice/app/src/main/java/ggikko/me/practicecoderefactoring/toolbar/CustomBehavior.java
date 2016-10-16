package ggikko.me.practicecoderefactoring.toolbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.view.View;

import ggikko.me.practicecoderefactoring.toolbar.CustomToolbar;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class CustomBehavior extends CoordinatorLayout.Behavior<CustomToolbar> {

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, CustomToolbar child, View directTargetChild, View target, int nestedScrollAxes) {
        return (nestedScrollAxes & ViewCompat.SCROLL_AXIS_VERTICAL) != 0;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, CustomToolbar child, View dependency) {
        if (child != null && dependency instanceof NestedScrollView) init(child, (NestedScrollView) dependency);
        return dependency instanceof NestedScrollView;
    }

    private boolean isAlreadyScrollListener = false;
    private boolean isTitleVisible = true;

    private void init(CustomToolbar customToolbar, NestedScrollView nestedScrollView) {
        if (!isAlreadyScrollListener) {
            setOnScrollChangeListener(customToolbar, nestedScrollView);
            isAlreadyScrollListener = true;
        }
    }

    private void setOnScrollChangeListener(CustomToolbar customToolbar, NestedScrollView nestedScrollView) {
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if(scrollY != 0 && isTitleVisible){
                    customToolbar.setCollapsedMode(true);
                    isTitleVisible = false;
                }else if(scrollY == 0 && !isTitleVisible){
                    customToolbar.setCollapsedMode(false);
                    isTitleVisible = true;
                }
            }
        });
    }
}
