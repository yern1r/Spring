import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1000);

            session.createQuery("update Employee " +
                            "set salary=1010" +
                    "where name = 'Yernar'")
                            .executeUpdate();

            session.getTransaction().commit();


            System.out.println("success");

        }finally {
            factory.close();
        }

    }
}
