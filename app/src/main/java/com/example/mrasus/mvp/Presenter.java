package com.example.mrasus.mvp;

/**
 * Created by Mr.Asus on 7/10/2018.
 */

public class Presenter implements Contract.Presenter {
    Contract.View view;
    Contract.Model model = new Model();
    @Override
    public void attachView(Contract.View view) {
        this.view = view;
        model.attachPresenter(this);
    }

    @Override
    public void onShow(String text) {
        model.getData(text);
    }

    @Override
    public void getFromMvp(String s) {
        view.showToast(s);
    }
}
