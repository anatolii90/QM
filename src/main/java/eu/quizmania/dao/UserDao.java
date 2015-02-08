package eu.quizmania.dao;

import java.util.List;

import eu.quizmania.model.User;

public interface UserDao {

    public void persist(User user);

    public List<User> fetchAll();

}