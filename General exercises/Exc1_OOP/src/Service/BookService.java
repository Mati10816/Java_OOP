package Service;

import Entity.Book;
import java.util.Scanner;

public class BookService {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Book dataLoading() {

        Book b1 = new Book();

        System.out.print("Enter the ISBN: ");
        b1.setISBN(input.nextInt());

        System.out.print("Enter the book´s title: ");
        b1.setTitle(input.next());

        System.out.print("Enter the book´s author: ");
        b1.setAuthor(input.next());

        System.out.print("Enter the total of pages: ");
        b1.setTotalPages(input.nextInt());

        return b1;

    }

    public void newIsbn(Book b1) {
        System.out.print("Ingrese cuanto quiere restar: ");
        int num = input.nextInt();
        int oldIsbn = b1.getISBN();
        
        int result = oldIsbn - num;
        
       b1.setISBN(result);
       

    }
}
