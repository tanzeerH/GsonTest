package com.buet_crt.csefest.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.buet_crt.csefest.dao.Subject;
import com.buet_crt.csefest.dao.Topics;

import com.buet_crt.csefest.dao.SubjectDao;
import com.buet_crt.csefest.dao.TopicsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig subjectDaoConfig;
    private final DaoConfig topicsDaoConfig;

    private final SubjectDao subjectDao;
    private final TopicsDao topicsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        subjectDaoConfig = daoConfigMap.get(SubjectDao.class).clone();
        subjectDaoConfig.initIdentityScope(type);

        topicsDaoConfig = daoConfigMap.get(TopicsDao.class).clone();
        topicsDaoConfig.initIdentityScope(type);

        subjectDao = new SubjectDao(subjectDaoConfig, this);
        topicsDao = new TopicsDao(topicsDaoConfig, this);

        registerDao(Subject.class, subjectDao);
        registerDao(Topics.class, topicsDao);
    }
    
    public void clear() {
        subjectDaoConfig.getIdentityScope().clear();
        topicsDaoConfig.getIdentityScope().clear();
    }

    public SubjectDao getSubjectDao() {
        return subjectDao;
    }

    public TopicsDao getTopicsDao() {
        return topicsDao;
    }

}
