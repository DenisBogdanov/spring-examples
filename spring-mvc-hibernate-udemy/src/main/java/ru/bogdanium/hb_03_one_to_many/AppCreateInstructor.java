package ru.bogdanium.hb_03_one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_03_one_to_many.entity.Instructor;
import ru.bogdanium.hb_03_one_to_many.entity.InstructorDetail;

public class AppCreateInstructor {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            Instructor instructor = new Instructor("Denis", "Bo", "denis@bo.com");
            InstructorDetail detail = new InstructorDetail("DenisBo", "Stupidity");

            instructor.setInstructorDetail(detail);

            session.save(instructor);

            session.getTransaction().commit();
        }
    }
}
