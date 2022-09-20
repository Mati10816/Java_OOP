package Main;

import Entity.Book;
import Service.BookService;

public class newBook {

    public static void main(String[] args) {

        BookService nB = new BookService();
        
        Book book1 = nB.dataLoading();
        
        System.out.println(book1);
        System.out.println("=======================");
        
        nB.newIsbn(book1);
        System.out.println(book1);
        
        Book book2 = nB.dataLoading();
        System.out.println("=============");
        System.out.println(book2);

    }

}
