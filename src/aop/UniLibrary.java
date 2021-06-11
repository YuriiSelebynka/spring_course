package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Ми беремо книгу із UniLibrary");
    }

     public void returnBook() {
        System.out.println("Ми повертаємо книгу в UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Ми беремо журнал із UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Ми повертаємо журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Ми додаємо книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Ми додаємо журнал в UniLibrary");
    }
}
