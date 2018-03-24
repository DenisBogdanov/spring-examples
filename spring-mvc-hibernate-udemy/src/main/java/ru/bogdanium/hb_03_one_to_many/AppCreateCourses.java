package ru.bogdanium.hb_03_one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_03_one_to_many.entity.Course;
import ru.bogdanium.hb_03_one_to_many.entity.Instructor;

public class AppCreateCourses {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            // get the instructor form db
            int id = 1;
            Instructor instructor = session.get(Instructor.class, id);

            // create some courses
            Course course1 = new Course("Stupid fat rat");
            Course course2 = new Course("Unit testing in Spring");

            // add courses to instructor
            instructor.add(course1);
            instructor.add(course2);

            // save the courses
            session.save(course1);
            session.save(course2);

            session.getTransaction().commit();
        }
    }
}
