package com.msy.globalaccess.data.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.msy.globalaccess.data.bean.NewsChannel;
import com.msy.globalaccess.data.bean.scenic.ScenicListBean;
import com.msy.globalaccess.data.bean.travel.TravelAgentListBean;
import com.msy.globalaccess.data.bean.user.User;

import com.msy.globalaccess.data.db.NewsChannelDao;
import com.msy.globalaccess.data.db.ScenicListBeanDao;
import com.msy.globalaccess.data.db.TravelAgentListBeanDao;
import com.msy.globalaccess.data.db.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsChannelDaoConfig;
    private final DaoConfig scenicListBeanDaoConfig;
    private final DaoConfig travelAgentListBeanDaoConfig;
    private final DaoConfig userDaoConfig;

    private final NewsChannelDao newsChannelDao;
    private final ScenicListBeanDao scenicListBeanDao;
    private final TravelAgentListBeanDao travelAgentListBeanDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsChannelDaoConfig = daoConfigMap.get(NewsChannelDao.class).clone();
        newsChannelDaoConfig.initIdentityScope(type);

        scenicListBeanDaoConfig = daoConfigMap.get(ScenicListBeanDao.class).clone();
        scenicListBeanDaoConfig.initIdentityScope(type);

        travelAgentListBeanDaoConfig = daoConfigMap.get(TravelAgentListBeanDao.class).clone();
        travelAgentListBeanDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        newsChannelDao = new NewsChannelDao(newsChannelDaoConfig, this);
        scenicListBeanDao = new ScenicListBeanDao(scenicListBeanDaoConfig, this);
        travelAgentListBeanDao = new TravelAgentListBeanDao(travelAgentListBeanDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(NewsChannel.class, newsChannelDao);
        registerDao(ScenicListBean.class, scenicListBeanDao);
        registerDao(TravelAgentListBean.class, travelAgentListBeanDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        newsChannelDaoConfig.clearIdentityScope();
        scenicListBeanDaoConfig.clearIdentityScope();
        travelAgentListBeanDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public NewsChannelDao getNewsChannelDao() {
        return newsChannelDao;
    }

    public ScenicListBeanDao getScenicListBeanDao() {
        return scenicListBeanDao;
    }

    public TravelAgentListBeanDao getTravelAgentListBeanDao() {
        return travelAgentListBeanDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
