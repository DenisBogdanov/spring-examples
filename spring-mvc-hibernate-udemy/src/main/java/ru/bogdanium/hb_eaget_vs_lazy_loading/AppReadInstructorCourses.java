package ru.bogdanium.hb_eaget_vs_lazy_loading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_eaget_vs_lazy_loading.entity.Instructor;

public class AppReadInstructorCourses {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            int id = 1;
            Instructor instructor = session.get(Instructor.class, id);

            System.out.println("Instructor: " + instructor);

            System.out.println("Courses: " + instructor.getCourses());

            session.getTransaction().commit();
        }
    }
}
