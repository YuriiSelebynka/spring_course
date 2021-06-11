package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(Book book) {
        System.out.println("Ми беремо книгу із UniLibrary " + book.getName());
    }

     String returnBook() {
        System.out.println("Ми повертаємо книгу в UniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Ми беремо журнал із UniLibrary");
    }
}
