package ru.bogdanium.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.entity.Student;

public class DeleteStudentDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

//            int studentId = 1;

            // start a transaction
            session.beginTransaction();

//            Student student = session.get(Student.class, studentId);

            // DELETE
//            session.delete(student);

            session.createQuery("delete from Student where id=2")
                    .executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
