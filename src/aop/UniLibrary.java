package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Ми беремо книгу із UniLibrary");
        System.out.println("-------------------------------------");
    }

     public String returnBook() {
        System.out.println("Ми повертаємо книгу в UniLibrary");
        return "Війна і мир";
    }

    public void getMagazine() {
        System.out.println("Ми беремо журнал із UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Ми повертаємо журнал в UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Ми додаємо книгу в UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Ми додаємо журнал в UniLibrary");
        System.out.println("-------------------------------------");
    }
}
