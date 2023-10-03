import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee")
//                            .getResultList();

            // name of field in Employee class
            List<Employee> emps = session.createQuery("from Employee " +
                            "where name = 'Yernar' " +
                            "and salary > 400")
                    .getResultList();

            for (Employee e:
                 emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();


            System.out.println("success");

        }finally {
            factory.close();
        }

    }
}
