package ru.bogdanium.hb_05_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_05_many_to_many.entity.Student;

public class AppDeleteStudent {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            int studentId = 3;
            Student student = session.get(Student.class, studentId);

            session.delete(student);

            session.getTransaction().commit();
        }
    }
}
