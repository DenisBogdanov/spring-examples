package ru.bogdanium.hb_04_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_04_one_to_many_uni.entity.Course;
import ru.bogdanium.hb_04_one_to_many_uni.entity.Review;

public class AppCreateCoursesAndReviews {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            // create a course
            Course course = new Course("Pacman");

            // add some reviews
            course.addReview(new Review("Great seller."));
            course.addReview(new Review("Fast shipping."));
            course.addReview(new Review("Ok."));

            // save the course
            session.save(course);

            session.getTransaction().commit();
        }
    }
}
