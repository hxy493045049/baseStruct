package com.msy.globalaccess.listener;

import android.content.Context;

/**
 * Created by shawn on 2017/8/18 0018.
 * <p>
 * description : 这个接口用于baseactivity,用于处理app异常崩溃导致的重启,app的欢迎页面需要实现该接口
 */

public interface IStartUpListener {
    void callActivity(Context ctx);
}
