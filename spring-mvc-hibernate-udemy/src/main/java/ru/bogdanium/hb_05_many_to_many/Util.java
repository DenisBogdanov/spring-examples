package ru.bogdanium.hb_05_many_to_many;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.hb_05_many_to_many.entity.*;

public class Util {

    public static SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        return factory;
    }
}
