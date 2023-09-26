package AOP;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary  extends AbstractLibrary{

    public void getBook( ) {
        System.out.println("We are taking a book from University Library "  );
    }


    //@Override
//    public void getBook(Book book) {
//        System.out.println("We are taking a book from University Library " + book.getName() );
//    }

    public String returnBook(){
        System.out.println("We are returning a book to University Library");
        return "Atomic Habits";
    }

    public void getMagazine() {
        System.out.println("We are taking a magazine from University Library");
        System.out.println("------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We are returning a magazine to University Library");
        System.out.println("-------------------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("We are adding a book to University Library "  );
        System.out.println("---------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We are adding a magazine to University Library");
        System.out.println("----------------------------------------------");
    }


}
