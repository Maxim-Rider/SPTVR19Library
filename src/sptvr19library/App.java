/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19library;

import entity.Reader;
import entity.Book;
import java.util.Scanner;

/**
 *
 * @author Comp
 */
class App {
    private Book[] books = new Book[10];
    public void run(){
        System.out.println("---Библиотека---");
        boolean repeat = true;
        do {
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы.");
            System.out.println("1. Добавить новую книгу.");
            System.out.println("2. Посмотреть список книг.");
            System.out.println("3. Зарегестрировать читателя.");
            System.out.println("4. Выдать книгу читателю.");
            System.out.println("5. Вернуть книгу в библиотеку.");
            System.out.print("Выберите задачу:");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("---Выход из программы---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("---1. Добавить новую книгу.---");
                    // создадим объект книги
                    Book book = new Book("Voina i Mir","L.Tolstoy", 2010);
                    books[0] = book;
                    Book book1 = new Book("Otsi i Deti","I.Turgenev", 2010);
                    books[1] = book1;
                    break;
                case "2":
                    System.out.println("---2. Список книг.---");
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] != null)
                        System.out.println(books[i].toString());
                    }
                    break;
                case "3":
                    System.out.println("---3. Зарегестрировать читателя.---");
                    Reader reader = new Reader("Maxim Kolesnikov", "+666 6666666");
                    System.out.println("Добавлен читатель: " + reader.getName());
                    break;
                case "4":
                    System.out.println("---4. Выдать книгу читателю.---");
                    break;
                case "5":
                    System.out.println("---5. Вернуть книгу в библиотеку.---");
                    break;
                default:
                    System.out.println("Нет такой задачи");
            }
        }while(repeat);
    }
}
