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

    public void returnBook(){
        System.out.println("We are returning a book to University Library");
    }

    public void getMagazine() {
        System.out.println("We are taking a magazine from University Library");
    }

    public void returnMagazine() {
        System.out.println("We are returning a magazine to University Library");
    }

    public void addBook( ) {
        System.out.println("We are adding a book to University Library "  );
    }

    public void addMagazine() {
        System.out.println("We are adding a magazine to University Library");
    }


}
