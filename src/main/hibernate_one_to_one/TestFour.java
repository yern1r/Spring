import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import entity.Employee;
import entity.Detail;

public class TestFour {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
            //----creating employer with details----//

//            Employee employee = new Employee("Misha" , "Sidorov",
//            "Security",455);
//            Detail detail = new Detail("Astana","999"
//            , "misha.email");

//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);

//            session.beginTransaction();

//            session.save(employee);//

//            session.getTransaction().commit();
//            System.out.println("success!! \nadded new data " );

//------------------------------------------------------------------------//
//            session = factory.getCurrentSession();
//            session.beginTransaction();

            //---getting infor about employer by detail---//

//            Detail detail = session.get(Detail.class, 4);
//           System.out.println(detail.getEmployee());

//            session.getTransaction().commit();
//            System.out.println("success!! \nadded new data " );

//----------------------------------------------------------------------------//
            //-------deleting only detail but employer will stay-------//
            session = factory.getCurrentSession();
            session.beginTransaction();

           Detail detail = session.get(Detail.class, 4);

            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("success!! \nadded new data " );

        }finally {
            session.close();
            factory.close();
        }

    }
}
