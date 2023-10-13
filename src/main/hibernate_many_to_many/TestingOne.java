import entity_many_to_many.Child;
import entity_many_to_many.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestingOne {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//
//            Child child1 = new Child("Zaur ", 11);
//            Child child2 = new Child("Zaurbay ", 12);
//            Child child3 = new Child("Zaurbek ", 13);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            //*******************************************//

//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Basketball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Boxing");
//
//
//            Child child1 = new Child("Danabek ", 15);
//
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
//
            //*******************************************//
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class , 1);
//
//            System.out.println(section);
//            System.out.println(section.getChildrenList());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            //*******************************************//

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class , 4);
//
//            System.out.println(child);
//            System.out.println(child.getSectionsList());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done");
            //****************deleting**********************//
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class , 5);
//
//            System.out.println("we are gonna remove" + section);
//            session.delete(section);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done");
            //****************Persist saving**********************//
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Cybersport");
//
//            Child child1 = new Child("Grealish ", 11);
//            Child child2 = new Child("Greasha ", 12);
//            Child child3 = new Child("Grealishbek ", 13);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
            //****************deleting child*******************//
            session = factory.getCurrentSession();
//
            session.beginTransaction();

            Child child = session.get(Child.class , 3);

            System.out.println("we are gonna remove" + child);
            session.delete(child);


            session.getTransaction().commit();
            System.out.println("Done");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
