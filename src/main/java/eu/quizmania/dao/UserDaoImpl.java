package eu.quizmania.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eu.quizmania.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void persist(User user) {
        getSession().persist(user);
    }

    @Override
    public List<User> fetchAll() {
        return getSession().createCriteria(User.class).list();
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
