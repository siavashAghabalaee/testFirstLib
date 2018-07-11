package com.example.mrasus.mvp;

/**
 * Created by Mr.Asus on 7/10/2018.
 */

public class Model implements Contract.Model {
    Contract.Presenter presenter;
    @Override
    public void attachPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getData(String text) {
        //pardazesh
        presenter.getFromMvp(text);
    }
}
