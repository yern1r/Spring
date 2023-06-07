package AOP;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary  extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("We are taking a book from University Library");
    }

    public void returnBook(){
        System.out.println("We are returning a book to University Library");
    }

    public void getMagazine() {
        System.out.println("We are taking a mahazine from University Library");
    }

}
