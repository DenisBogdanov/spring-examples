package ru.bogdanium.hb_01_one_to_one_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_01_one_to_one_uni.entity.Instructor;

public class AppDelete {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory()) {

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            // get instructor by primary key
            int id = 1;
            Instructor instructor = session.get(Instructor.class, id);

            System.out.println("Found instructor: " + instructor);

            // delete the instructor
            if (instructor != null) {
                System.out.println("Deleting: " + instructor);

                session.delete(instructor);
            }

            session.getTransaction().commit();
        }
    }
}
