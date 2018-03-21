package ru.bogdanium.crud_demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.crud_demo.entity.Student;

public class UpdateStudentDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            int studentId = 1;

            // start a transaction
            session.beginTransaction();

            Student student = session.get(Student.class, studentId);

            System.out.println("Updating student=" + student);

            // UPDATE
            student.setFirstName("Scooby");

            session.createQuery("update Student set email='foo@gmail.com'")
                    .executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
