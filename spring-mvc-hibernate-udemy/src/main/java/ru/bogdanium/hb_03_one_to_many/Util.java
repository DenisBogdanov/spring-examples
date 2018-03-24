package ru.bogdanium.hb_03_one_to_many;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.hb_03_one_to_many.entity.Course;
import ru.bogdanium.hb_03_one_to_many.entity.Instructor;
import ru.bogdanium.hb_03_one_to_many.entity.InstructorDetail;

public class Util {

    public static SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        return factory;
    }
}
