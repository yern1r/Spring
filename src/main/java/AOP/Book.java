package AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Atomic Habits")
    private String name;

    @Value("Author : James")
    private String author;

    @Value("2019")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
