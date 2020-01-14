package fmi.homework.informatics;
import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private String name = "Библиотека 1.0";
    ArrayList<Book> books = new ArrayList<>();
    Book book = new Book(); //made a new object?

    public void enterBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете заглавие: ");
        book.title = sc.nextLine();
        System.out.println("Въведете автор: ");
        this.author = sc.nextLine();
        System.out.println("Въведете година на издаване: ");
        this.yearPublishing = sc.nextLine();
        System.out.println("Въведете издателство: ");
        this.publishers = sc.nextLine();
        System.out.println("Въведете ISBN: ");
        this.isbn = sc.nextLine();


    }

}


