
package Entity;

public class Book {
    
    private int isbn;
    private String title;
    private String author;
    private int totalPages;
    
    // Empty builder
    public Book() {
    }
    
    //Full builder
    public Book(int isbn, String title, String author, int totalPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
    }

    //SETTERs
    public void setISBN(int ISBN) {
        this.isbn = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    
    //GETTERs
    public int getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Total pages: " + totalPages + '}';
    }
    
    
    
    
    
    
    
    
}
