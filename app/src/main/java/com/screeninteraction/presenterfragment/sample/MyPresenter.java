package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.Presenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyPresenter extends Presenter<MyPresenterFragment, MyView> {

    @Override
    public MyView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (MyView) inflater.inflate(R.layout.my_view, container, false);
    }

    @Override
    public void onViewCreated(MyView view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenterView().setButtonText("Start other fragment!");
        getPresenterView().setButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragment().showMyOtherFragment();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenterView().setText("Hello world");
    }


    @Override
    public void onPause() {
        super.onPause();
        getPresenterView().setText("Bye world");
    }

    public void doSomethingFragmentRelated() {
        getFragment().showMyOtherFragment();
    }
}
