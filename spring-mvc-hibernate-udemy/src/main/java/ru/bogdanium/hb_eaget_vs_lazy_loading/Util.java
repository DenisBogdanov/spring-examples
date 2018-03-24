package ru.bogdanium.hb_eaget_vs_lazy_loading;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bogdanium.hb_eaget_vs_lazy_loading.entity.Course;
import ru.bogdanium.hb_eaget_vs_lazy_loading.entity.Instructor;
import ru.bogdanium.hb_eaget_vs_lazy_loading.entity.InstructorDetail;

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
