package ru.bogdanium.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.entity.Student;

import java.util.List;

public class QueryStudentDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            List students = session
                    .createQuery("from Student s where s.lastName='Doe'")
                    .getResultList();

            students.forEach(System.out::println);

            // commit transaction
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
