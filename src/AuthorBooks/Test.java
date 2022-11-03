package AuthorBooks;

import java.util.ArrayList;

public class Test {
    public void run() {
        System.out.println("AUTHUR AND BOOKS \n" );

        ArrayList<Book> bøger = new ArrayList<>();

        //Oprettelse af Authur
        Authur authur = new Authur("Collen Hoover", 'F', "Collen.Hover@gmail.com");

        //Oprettelse af Books
        Book CoHoBook = new Book("It ends with us", authur, 376);
        Book CoHoBook2 = new Book("Ugly love", authur, 336);

        authur.books.add(CoHoBook);
        authur.books.add(CoHoBook2);

        System.out.println(authur.books.get(0).getAuthur());
        System.out.println("   " + authur.books.get(0).getTitle() + "            " + authur.books.get(0).getPageNumber());
        System.out.println("   " + authur.books.get(1).getTitle() + "                  " + authur.books.get(1).getPageNumber());


    }
    public static void main(String[] args) {
        new Test().run();
    }

}
