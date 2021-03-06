package ru.bogdanium.hb_03_one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_03_one_to_many.entity.Course;

public class AppDeleteCourse {

    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            int courseId = 2;
            Course course = session.get(Course.class, courseId);

            session.delete(course);

            session.getTransaction().commit();
        }
    }

}
