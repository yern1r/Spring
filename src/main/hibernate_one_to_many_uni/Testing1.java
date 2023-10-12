import entity_one_to_many_uni.Departament;
import entity_one_to_many_uni.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Testing1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Departament.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();


//            Departament departament = new Departament("Security",
//                    300 , 1500);
//
//            Employee employer1 = new Employee("Yershat",
//                    "Khabdrashit", 500);
//
//            Employee employer2 = new Employee("Sultan",
//                    "Zhaksylyq", 600);
//
//            departament.addEmployeeToDepartment(employer1);
//            departament.addEmployeeToDepartment(employer2);


            session.beginTransaction();

//            Departament departament = session.get(Departament.class , 15);
//            System.out.println(departament);
//            System.out.println(departament.getEmployeeList());

//            Departament departament = session.get(Departament.class , 12);
//            session.delete(departament);

            Employee employee = session.get(Employee.class , 5);
            session.delete(employee);

//            session.save(departament);

            session.getTransaction().commit();

            System.out.println("success!! \nadded new data ");
        }finally {
            factory.close();
        }

    }
}
