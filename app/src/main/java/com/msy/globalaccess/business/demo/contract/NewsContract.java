package com.msy.globalaccess.business.demo.contract;


import com.msy.globalaccess.listener.IBaseContract;
import com.msy.globalaccess.data.bean.NewsChannel;
import com.msy.globalaccess.listener.IProgress;

import java.util.List;

/**
 * Created by hxy on 2016/12/12 0012.
 * <p>
 * description :
 */
public interface NewsContract {
    interface View extends IBaseContract.View, IProgress {
        void initViewPager(List<NewsChannel> newsChannels);
    }

    interface Presenter extends IBaseContract.Presenter {
        void onChannelDbChanged();

        void loadRemoteNews();
    }
}
