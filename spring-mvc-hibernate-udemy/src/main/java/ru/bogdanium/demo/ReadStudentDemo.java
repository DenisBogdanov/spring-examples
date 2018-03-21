package ru.bogdanium.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.entity.Student;

public class ReadStudentDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create a student object
            Student student = new Student("Daffy", "Duck", "d@duck.com");

            // start a transaction
            session.beginTransaction();

            // save the student object
            session.save(student);

            // commit transaction
            session.getTransaction().commit();

            // find out the student's id: primary key
            System.out.println("Saved student. Generated id=" + student.getId());

            // READ
            session = factory.getCurrentSession();
            session.beginTransaction();

            Student myStudent = session.get(Student.class, student.getId());

            session.getTransaction().commit();

            System.out.println("Retrieved student=" + myStudent);

        } finally {
            factory.close();
        }
    }
}
