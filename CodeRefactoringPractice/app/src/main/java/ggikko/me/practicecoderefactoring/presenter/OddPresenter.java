package ggikko.me.practicecoderefactoring.presenter;

import javax.inject.Inject;

import ggikko.me.practicecoderefactoring.util.Hot;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class OddPresenter {

    private Hot hot;

    @Inject
    public OddPresenter(Hot hot){
        this.hot = hot;
    }
}
