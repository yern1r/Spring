import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import entity.Employee;
import entity.Detail;
public class TestThree {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
             session = factory.getCurrentSession();


            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmpDetail());
                session.delete(employee);
            session.getTransaction().commit();
            System.out.println("success!! \nadded new data " );
        }finally {
            session.close();
            factory.close();
        }

    }
}
