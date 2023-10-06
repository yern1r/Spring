import entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import entity.Employee;

public class TestTwo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Aibek", "Kunakbaev",
                    "HR", 400);

            Detail detail = new Detail("Almaty",
                    "87478888323", "aibek@mail.ru");

            session.beginTransaction();
            employee.setEmpDetail(detail);

            session.save(employee);

            session.getTransaction().commit();
            System.out.println("success!! \nadded new data " );
        }finally {
            factory.close();
        }

    }
}
