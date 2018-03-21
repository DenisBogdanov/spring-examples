package ru.bogdanium.hb_02_one_to_one_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_02_one_to_one_bi.entity.InstructorDetail;

public class AppDelete {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            // get the instructor detail object
            int id = 2;
            InstructorDetail detail = session.get(InstructorDetail.class, id);

            // remove the associated object reference, break be-directional link
            detail.getInstructor().setInstructorDetail(null);

            session.delete(detail);

            session.getTransaction().commit();
        }
    }
}
