import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 3);
//            System.out.println(emp);
//            session.delete(emp);

            session.createQuery("delete Employee " +
                            "where surname= 'Bratan'")
                    .executeUpdate();
            session.getTransaction().commit();


            System.out.println("success");

        }finally {
            factory.close();
        }

    }
}