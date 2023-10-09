import entity_one_to_many.Departament;
import entity_one_to_many.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Departament.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

            Departament departament = new Departament("HR",
                    300 , 1200);

            Employee employer1 = new Employee("Diana",
                    "Serik", 365);

            Employee employer2 = new Employee("Gulnaz",
                    "Melsova", 400);

            departament.addEmployeeToDepartment(employer1);
            departament.addEmployeeToDepartment(employer2);

            session.beginTransaction();

            session.save(departament);

            session.getTransaction().commit();

            System.out.println("success!! \nadded new data ");
        }finally {
            factory.close();
        }

    }
}
