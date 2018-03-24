package ru.bogdanium.hb_05_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_05_many_to_many.entity.Student;

public class AppReadCoursesForStudent {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            int studentId = 2;
            Student student = session.get(Student.class, studentId);

            System.out.println("\nStudent: " + student);
            System.out.println("\nCourses: " + student.getCourses());

            session.getTransaction().commit();
        }
    }
}
