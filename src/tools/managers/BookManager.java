package tools.managers;

import entity.Book;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Comp
 */
public class BookManager {
    public Book createBook() {
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Создание книги ---");
        System.out.print("Название книги: ");
        book.setName(scanner.nextLine());
        System.out.print("Автор книги: ");
        book.setAuthor(scanner.nextLine());
        System.out.print("Год издания книги: ");
        book.setPublishedYear(scanner.nextInt());
        return book;
    }
    public void addBookToArray(Book book, List<Book> books){
        books.add(book);
    }

    public void printListBooks(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i)!= null){
                System.out.printf("%3d. Название книги: %s%nАвтор: %s%n"
                        ,i+1
                        ,books.get(i).getName()
                        ,books.get(i).getAuthor()
                );
                System.out.println("--------------------------------");
            }
        }
    }
    
}
