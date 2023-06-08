package AOP;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary  extends AbstractLibrary{
    //@Override
    public void getBook(Book book) {
        System.out.println("We are taking a book from University Library " + book.getName() );
    }

    public void returnBook(){
        System.out.println("We are returning a book to University Library");
    }

    public void getMagazine() {
        System.out.println("We are taking a mahazine from University Library");
    }

}
