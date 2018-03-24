package ru.bogdanium.hb_04_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_04_one_to_many_uni.entity.Course;

public class AppReadCoursesAndReviews {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            int id = 10;
            Course course = session.get(Course.class, id);

            System.out.println("Course: " + course);
            System.out.println("Course: " + course.getReviews());

            session.getTransaction().commit();
        }
    }
}
