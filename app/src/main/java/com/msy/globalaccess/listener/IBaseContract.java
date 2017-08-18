package com.msy.globalaccess.listener;

import android.support.annotation.NonNull;

/**
 * Created by hxy on 2016/12/13 0013.
 * <p>
 * description :
 */

public interface IBaseContract {
    interface View {
    }

    interface Presenter {
        void onStart();

        void attachView(@NonNull View view);

        void onDestroy();

        void cancelRequest();
    }
}
