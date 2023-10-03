import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Aleksei", "Oleg",
                    "Product", 345);

            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            //---------------getting by id (select function) ------------//
            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("success");

//            System.out.println("success!! \nadded new data " + emp);
        }finally {
            factory.close();
        }

    }
}
