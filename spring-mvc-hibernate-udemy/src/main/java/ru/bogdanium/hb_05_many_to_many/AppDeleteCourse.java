package ru.bogdanium.hb_05_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_05_many_to_many.entity.Course;

public class AppDeleteCourse {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            int courseId = 12;
            Course course = session.get(Course.class, courseId);

            session.delete(course);

            session.getTransaction().commit();
        }
    }
}
