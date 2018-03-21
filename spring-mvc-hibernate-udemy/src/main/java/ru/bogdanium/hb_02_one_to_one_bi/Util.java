package ru.bogdanium.hb_02_one_to_one_bi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.hb_02_one_to_one_bi.entity.Instructor;
import ru.bogdanium.hb_02_one_to_one_bi.entity.InstructorDetail;

public class Util {

    public static SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        return factory;
    }
}
