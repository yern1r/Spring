package AOP;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    //@Override
    public void getBook() {
        System.out.println("We ara getting book from School Library");
    }
}
