package com.zzw.dao;

public interface UserDao {
    public void add(User user);

    public User getUser(int id);

    public void update(User user);
}
