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
//            Session session = factory.getCurrentSession();


//            Departament departament = new Departament("Sales",
//                    600 , 1400);
//
//            Employee employer1 = new Employee("Anton",
//                    "Serik", 900);
//
//            Employee employer2 = new Employee("Aibek",
//                    "Melsov", 1400);
//
//            Employee employer3 = new Employee("Gulbarshyn",
//                    "Melsova", 600);
//
//            departament.addEmployeeToDepartment(employer1);
//            departament.addEmployeeToDepartment(employer2);
//            departament.addEmployeeToDepartment(employer3);
//
//            session.beginTransaction();
//
//            session.save(departament);
//
//            session.getTransaction().commit();
//
//            System.out.println("success!! \nadded new data ");

            //**************************************************//
            Session session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department");
            Departament departament = session.get(Departament.class , 16);

            System.out.println("Show department");
            System.out.println(departament);

//            for lazy fetch
//            System.out.println("loading our employees");
//            departament.getEmployeeList().get(0);

            session.getTransaction().commit();
            System.out.println("success!! \nadded new data ");

            System.out.println("Show employees of department ");
            System.out.println(departament.getEmployeeList());

        }finally {
            factory.close();
        }

    }
}
