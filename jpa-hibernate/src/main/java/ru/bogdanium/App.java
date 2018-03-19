package ru.bogdanium;

import org.hibernate.Session;
import ru.bogdanium.data.HibernateUtil;
import ru.bogdanium.data.entities.User;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        User user = new User();
        user.setBirthDate(new Date());
        user.setCreatedBy("Denis");
        user.setCreatedDate(new Date());
        user.setEmailAddress("denis@bo.ru");
        user.setFirstName("Denis");
        user.setLastName("Bo");
        user.setLastUpdatedBy("Denis");
        user.setLastUpdatedDate(new Date());

        session.save(user);

        session.getTransaction().commit();

        session.close();
    }
}
