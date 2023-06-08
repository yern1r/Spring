package AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Atomic Habits")
    private String name;

    public String getName() {
        return name;
    }
}
