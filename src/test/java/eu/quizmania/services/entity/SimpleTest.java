/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.quizmania.services.entity;

import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 *
 * @author kamil
 */
@NoArgsConstructor
public class SimpleTest {

    @Test
    public void simpleAppTest() {
        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        SimpleTestColumn title = new SimpleTestColumn("default title");

        session.save(title);

        session.getTransaction().commit();
        session.close();
    }
}
