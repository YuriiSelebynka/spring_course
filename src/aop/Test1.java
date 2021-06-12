package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary Unilibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        Unilibrary.getBook();
        Unilibrary.addBook("Yurii",book);
        Unilibrary.addMagazine();

//        Unilibrary.returnBook();
//        Unilibrary.returnMagazine();
//        Unilibrary.addBook();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",
//                SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
