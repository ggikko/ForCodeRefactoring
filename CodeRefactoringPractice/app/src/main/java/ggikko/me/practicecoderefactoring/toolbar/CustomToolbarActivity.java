package ggikko.me.practicecoderefactoring.toolbar;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ggikko.me.practicecoderefactoring.R;

public class CustomToolbarActivity extends AppCompatActivity {

    @BindView(R.id.customToolbar) CustomToolbar customToolbar;
    @BindView(R.id.nestedScrollView) NestedScrollView nestedScrollView;

//    private boolean flag = true;

//    @OnClick(R.id.actionButton)
//    void clickActionButton(){
//        customToolbar.setCollapsedMode(flag);
//        if(flag) {
//            flag = false;
//        }else{
//            flag = true;
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);
        ButterKnife.bind(this);

//        setNestedScrollViewListener();
    }

//    private boolean isTitleVisible = true;

//    private void setNestedScrollViewListener() {
//        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
//            @Override
//            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                if(scrollY != 0 && isTitleVisible){
//                    customToolbar.setCollapsedMode(true);
//                    isTitleVisible = false;
//                }else if(scrollY == 0 && !isTitleVisible){
//                    customToolbar.setCollapsedMode(false);
//                    isTitleVisible = true;
//                }
//            }
//        });
//    }
}
