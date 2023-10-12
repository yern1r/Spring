import entity_one_to_many.Departament;
import entity_one_to_many.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Departament.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();


            session.beginTransaction();
            Departament departament = session.get(Departament.class , 14);
            session.delete(departament);


//            Employee employee = session.get(Employee.class, 1);

//            System.out.println(employee);
//            System.out.println(employee.getDepartament());

//            session.delete(employee);
//*******************************************************************************
//            Departament departament = session.get(Departament.class , 13);

//            System.out.println(departament);
//            System.out.println(departament.getEmployeeList());


            session.getTransaction().commit();

            System.out.println("success!! \nadded new data ");
        }finally {
            factory.close();
        }

    }
}
