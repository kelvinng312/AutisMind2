package com.autismindd.dao;

import java.util.List;
import com.autismindd.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "USER".
 */
public class User {

    private Long id;
    /** Not-null value. */
    private String name;
    /** Not-null value. */
    private String password;
    private int avatar;
    /** Not-null value. */
    private String pic;
    private long key;
    private boolean userState;
    private int stars;
    private int firstLayerTaskID;
    private int lastLevelID;
    private int point;
    private boolean active;
    private int helper;
    private int music;
    private int taskPlayProgress;
    private int soundEffect;
    /** Not-null value. */
    private java.util.Date createdAt;
    /** Not-null value. */
    private java.util.Date updatedAt;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient UserDao myDao;

    private List<Task> tasks;
    private List<Level> levelList;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String name, String password, int avatar, String pic, long key, boolean userState, int stars, int firstLayerTaskID, int lastLevelID, int point, boolean active, int helper, int music, int taskPlayProgress, int soundEffect, java.util.Date createdAt, java.util.Date updatedAt) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.avatar = avatar;
        this.pic = pic;
        this.key = key;
        this.userState = userState;
        this.stars = stars;
        this.firstLayerTaskID = firstLayerTaskID;
        this.lastLevelID = lastLevelID;
        this.point = point;
        this.active = active;
        this.helper = helper;
        this.music = music;
        this.taskPlayProgress = taskPlayProgress;
        this.soundEffect = soundEffect;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    /** Not-null value. */
    public String getPassword() {
        return password;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPassword(String password) {
        this.password = password;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    /** Not-null value. */
    public String getPic() {
        return pic;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPic(String pic) {
        this.pic = pic;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public boolean getUserState() {
        return userState;
    }

    public void setUserState(boolean userState) {
        this.userState = userState;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getFirstLayerTaskID() {
        return firstLayerTaskID;
    }

    public void setFirstLayerTaskID(int firstLayerTaskID) {
        this.firstLayerTaskID = firstLayerTaskID;
    }

    public int getLastLevelID() {
        return lastLevelID;
    }

    public void setLastLevelID(int lastLevelID) {
        this.lastLevelID = lastLevelID;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getHelper() {
        return helper;
    }

    public void setHelper(int helper) {
        this.helper = helper;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    public int getTaskPlayProgress() {
        return taskPlayProgress;
    }

    public void setTaskPlayProgress(int taskPlayProgress) {
        this.taskPlayProgress = taskPlayProgress;
    }

    public int getSoundEffect() {
        return soundEffect;
    }

    public void setSoundEffect(int soundEffect) {
        this.soundEffect = soundEffect;
    }

    /** Not-null value. */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /** Not-null value. */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Task> getTasks() {
        if (tasks == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TaskDao targetDao = daoSession.getTaskDao();
            List<Task> tasksNew = targetDao._queryUser_Tasks(id);
            synchronized (this) {
                if(tasks == null) {
                    tasks = tasksNew;
                }
            }
        }
        return tasks;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetTasks() {
        tasks = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Level> getLevelList() {
        if (levelList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LevelDao targetDao = daoSession.getLevelDao();
            List<Level> levelListNew = targetDao._queryUser_LevelList(id);
            synchronized (this) {
                if(levelList == null) {
                    levelList = levelListNew;
                }
            }
        }
        return levelList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetLevelList() {
        levelList = null;
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
