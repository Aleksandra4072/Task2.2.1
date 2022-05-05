package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    public void getByModelAndSeries(String carModel, int carSeries);
}