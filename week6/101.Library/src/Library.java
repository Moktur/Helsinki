
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pepe
 */
public class Library {
    
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public Library() {
        
    }
    
    public void addBook(Book newBook) {
        books.add(newBook);
    }
    
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        // Gehe die Liste durch, vergleiche den Titel jeden Buches 
        // mit dem Paramenter, wenn diese identisch sind, füge das
        // Buch zu der "found" ArrayList
        for (Book book : books) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : books) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
    
}
