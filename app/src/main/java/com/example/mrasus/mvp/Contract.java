package com.example.mrasus.mvp;

/**
 * Created by Mr.Asus on 7/10/2018.
 */

public interface Contract {
    interface View{
        void showToast(String s);
    }

    interface Presenter{
        void attachView(View view);
        void onShow(String text);
        void getFromMvp(String s);


    }

    interface Model{
        void attachPresenter(Presenter presenter);
        void getData(String text);

    }
}
