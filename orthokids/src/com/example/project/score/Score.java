package com.example.project.score;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;

public class Score {

    private Long id;
    /** Not-null value. */
    private String player;
    /** Not-null value. */
    private java.util.Date date;
    private int value;
    private Long scoreowner;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ScoreDao myDao;

    private Profile profile;
    private Long profile__resolvedKey;


    public Score() {
    }

    public Score(Long id) {
        this.id = id;
    }

    public Score(Long id, String player, java.util.Date date, int value, Long scoreowner) {
        this.id = id;
        this.player = player;
        this.date = date;
        this.value = value;
        this.scoreowner = scoreowner;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getScoreDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getPlayer() {
        return player;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPlayer(String player) {
        this.player = player;
    }

    /** Not-null value. */
    public java.util.Date getDate() {
        return date;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Long getScoreowner() {
        return scoreowner;
    }

    public void setScoreowner(Long scoreowner) {
        this.scoreowner = scoreowner;
    }

    /** To-one relationship, resolved on first access. */
    public Profile getProfile() {
        if (profile__resolvedKey == null || !profile__resolvedKey.equals(scoreowner)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ProfileDao targetDao = daoSession.getProfileDao();
            profile = targetDao.load(scoreowner);
            profile__resolvedKey = scoreowner;
        }
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
        scoreowner = profile == null ? null : profile.getId();
        profile__resolvedKey = scoreowner;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
