package ru.bogdanium.hb_05_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.bogdanium.hb_05_many_to_many.entity.Course;
import ru.bogdanium.hb_05_many_to_many.entity.Student;

public class AppCreateCoursesAndStudents {
    public static void main(String[] args) {

        try (SessionFactory factory = Util.getSessionFactory();
             Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            Course course1 = new Course("Yellow");
            Course course2 = new Course("Second");
            Course course3 = new Course("Full");

            session.save(course1);
            session.save(course2);
            session.save(course3);

            Student student1 = new Student("John", "Doe", "john@gmail.com");
            Student student2 = new Student("Jane", "Doe", "jane@gmail.com");
            Student student3 = new Student("Ivan", "Drago", "ivan@gmail.com");

            course1.addStudent(student1);
            course1.addStudent(student2);

            course2.addStudent(student1);
            course2.addStudent(student2);
            course2.addStudent(student3);

            course3.addStudent(student2);

            session.save(student1);
            session.save(student2);
            session.save(student3);

            session.getTransaction().commit();
        }
    }
}
