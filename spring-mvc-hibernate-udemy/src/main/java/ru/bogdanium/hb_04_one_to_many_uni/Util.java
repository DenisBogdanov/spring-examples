package ru.bogdanium.hb_04_one_to_many_uni;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.hb_04_one_to_many_uni.entity.Course;
import ru.bogdanium.hb_04_one_to_many_uni.entity.Instructor;
import ru.bogdanium.hb_04_one_to_many_uni.entity.InstructorDetail;
import ru.bogdanium.hb_04_one_to_many_uni.entity.Review;

public class Util {

    public static SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        return factory;
    }
}
