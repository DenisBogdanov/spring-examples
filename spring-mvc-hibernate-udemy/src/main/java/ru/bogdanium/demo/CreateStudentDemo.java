package ru.bogdanium.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.entity.Student;

public class CreateStudentDemo {
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
            Student student1 = new Student("John", "Doe", "j@doe.com");
            Student student2 = new Student("Jane", "Doe", "jane@doe.com");
            Student student3 = new Student("Paul", "Wall", "p@wall.com");

            // start a transaction
            session.beginTransaction();

            // save the student object
            session.save(student1);
            session.save(student2);
            session.save(student3);

            // commit transaction
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
