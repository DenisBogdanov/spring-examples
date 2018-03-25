package ru.bogdanium.hb_eager_vs_lazy_loading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.bogdanium.hb_eager_vs_lazy_loading.entity.Instructor;

public class AppFetchJoin {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            int id = 1;
            Query<Instructor> query = session.createQuery("" +
                    " select i from Instructor i" +
                    " join fetch i.courses" +
                    " where i.id=:instructorId", Instructor.class);

            query.setParameter("instructorId", id);

            Instructor instructor = query.getSingleResult();

            System.out.println("Instructor: " + instructor);
            System.out.println("Courses: " + instructor.getCourses());

            session.getTransaction().commit();
        }
    }
}
