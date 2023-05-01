package classroom;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //display menu
        System.out.println("1. Add new book");
        System.out.println("2.Print all books");
        System.out.println("3. Search book by ID");
        System.out.println("4. Search book by Name");
        System.out.println("5. Modify Author by book name");
        System.out.println("6. Exit");
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while (choice != 6) {
            switch (choice) {
                case 1:
                    System.out.println("Enter book id");
                    int id = sc.nextInt();
                    System.out.println("Enter book name");
                    String name = sc.next();
                    System.out.println("Enter book author");
                    String author = sc.next();
                    System.out.println("Enter year of publication");
                    int yop = sc.nextInt();
                    Book book = new Book(id, name, author, yop);
                    lib.addBook(book);
                    break;
                case 2:
                    lib.printAllBooks();
                    break;
                case 3:
                    System.out.println("Enter book id");
                    int id1 = sc.nextInt();
                    lib.SearchBookId(id1);
                    break;
                case 4:
                    System.out.println("Enter book name");
                    String name1 = sc.next();
                    lib.SearchBookName(name1);
                    break;
                case 5:
                    System.out.println("Enter book name");
                    String name2 = sc.next();
                    lib.modifyAuthor(name2);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("1. Add new book");
            System.out.println("2.Print all books");
            System.out.println("3. Search book by ID");
            System.out.println("4. Search book by Name");
            System.out.println("5. Modify Author by book name");
            System.out.println("6. Exit");
            choice = sc.nextInt();
        }
        sc.close();

    }
}