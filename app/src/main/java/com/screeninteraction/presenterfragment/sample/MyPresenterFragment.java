package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.PresenterFragment;

public class MyPresenterFragment extends PresenterFragment<MyPresenter> {

    public MyPresenterFragment(){
        setPresenter(new MyPresenter());
    }
}