package ru.bogdanium.hb_01_one_to_one_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_01_one_to_one_uni.entity.Instructor;
import ru.bogdanium.hb_01_one_to_one_uni.entity.InstructorDetail;

public class AppCreate {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory()) {

            Instructor instructor = new Instructor("Denis", "Bo", "denis@bo.com");
            InstructorDetail detail = new InstructorDetail("DenisBo", "Stupidity");

//            Instructor instructor = new Instructor("John", "Doe", "john@doe.com");
//            InstructorDetail detail = new InstructorDetail("JohnDoe", "Reading");

            instructor.setInstructorDetail(detail);

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            // save the instructor
            session.save(instructor);

            session.getTransaction().commit();
        }
    }
}
