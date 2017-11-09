package com.example.project.score;

import java.util.Map;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.IdentityScopeType;

public class DaoSession extends AbstractDaoSession {

    private final DaoConfig scoreDaoConfig;
    private final DaoConfig profileDaoConfig;
    private final DaoConfig imageDaoConfig;
    private final DaoConfig responseDaoConfig;

    private final ScoreDao scoreDao;
    private final ProfileDao profileDao;
    private final ImageDao imageDao;
    private final ResponseDao responseDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        scoreDaoConfig = daoConfigMap.get(ScoreDao.class).clone();
        scoreDaoConfig.initIdentityScope(type);

        profileDaoConfig = daoConfigMap.get(ProfileDao.class).clone();
        profileDaoConfig.initIdentityScope(type);

        imageDaoConfig = daoConfigMap.get(ImageDao.class).clone();
        imageDaoConfig.initIdentityScope(type);

        responseDaoConfig = daoConfigMap.get(ResponseDao.class).clone();
        responseDaoConfig.initIdentityScope(type);

        scoreDao = new ScoreDao(scoreDaoConfig, this);
        profileDao = new ProfileDao(profileDaoConfig, this);
        imageDao = new ImageDao(imageDaoConfig, this);
        responseDao = new ResponseDao(responseDaoConfig, this);

        registerDao(Score.class, scoreDao);
        registerDao(Profile.class, profileDao);
        registerDao(Image.class, imageDao);
        registerDao(Response.class, responseDao);
    }
    
    public void clear() {
        scoreDaoConfig.getIdentityScope().clear();
        profileDaoConfig.getIdentityScope().clear();
        imageDaoConfig.getIdentityScope().clear();
        responseDaoConfig.getIdentityScope().clear();
    }

    public ScoreDao getScoreDao() {
        return scoreDao;
    }

    public ProfileDao getProfileDao() {
        return profileDao;
    }

    public ImageDao getImageDao() {
        return imageDao;
    }

    public ResponseDao getResponseDao() {
        return responseDao;
    }

}
